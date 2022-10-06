package shop.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import shop.constant.UserStatus;

import javax.persistence.*;
import java.sql.Timestamp;

@Getter
@Setter
@Entity(name = "TB_USER")
@Table(name="TB_USER")
public class User {

    @Id
    @Column(name = "USER_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long userId;

    @Column(name = "LOGIN_ID", unique = true, length = 50, nullable = false)
    private String loginId;

    @Column(name = "PASSWORD", length = 150, nullable = false)
    private String password;

    @Column(name = "USER_NAME", length = 20, nullable = false)
    private String userName;

    @Column(name = "EMAIL", length = 100)
    private String email;

    @Column(name = "MOBILE", length = 11, nullable = false)
    private String mobile;

    @Enumerated(EnumType.STRING)
    @Column(name = "USER_STATUS", length = 8, nullable = false)
    private UserStatus userStatus;

    @Column(name = "UPDATE_DATE")
    @UpdateTimestamp
    private Timestamp updateDate;

    @Column(name = "CREATE_DATE")
    @CreationTimestamp
    private Timestamp creatDate;
}
