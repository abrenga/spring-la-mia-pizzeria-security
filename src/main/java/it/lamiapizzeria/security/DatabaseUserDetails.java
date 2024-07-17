package it.lamiapizzeria.security;

public class DatabaseUserDetails implements UserDetails {
    private final Integer id;
    private final String username;
    private final String password;
    private final Set<GrantedAuthority> authorities;
    public DatabaseUserDetails(User user) {
    this.id = user.getId();
    this.username = user.getUsername();
    this.password = user.getPassword();
   
    authorities = new HashSet<GrantedAuthority>();
    for(Role role : user.getRoles()) {
    authorities.add(new SimpleGrantedAuthority(role.getName()));
    }
    }
}