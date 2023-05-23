package hello.springtx.propagation;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Member {

    @GeneratedValue
    @Id
    private Long id;
    private String userName;

    public Member() {
    }

    public Member(String userName) {
        this.userName = userName;
    }
}
