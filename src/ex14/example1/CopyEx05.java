package ex14.example1;


import java.time.LocalDateTime;

class JoinDTO {
    private String username;    //ssar
    private String password;
    private String email;

    public JoinDTO(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }
}

class Member {
    private int no;
    private String username;
    private String password;
    private String email;
    private LocalDateTime createdAt; //날짜를 저장하는 타입!! 생성시간!

    public Member(int no, JoinDTO dto) {
        this.no = no;
        this.username = dto.getUsername();
        this.password = dto.getPassword();
        this.email = dto.getEmail();
        this.createdAt = LocalDateTime.now();
    }
}

public class CopyEx05 {
    public static void main(String[] args) {
        //d1, d2를 Member에 올릴 것.
        JoinDTO d1 = new JoinDTO("ssar", "1234", "ssar@nate.com");
        JoinDTO d2 = new JoinDTO("cos", "1234", "cos@nate.com");

        //클래스에 있는 데이터를 옮겨담는 것
        Member m1 = new Member(1,d1);
        Member m2 = new Member(2,d2);

        //        LocalDateTime now = LocalDateTime.now();
//        LocalDateTime now2 = now.plusgDays(1);
//        System.out.println(now2);
    }
}
