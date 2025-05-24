@Entity
public class Template {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @Lob
    private String layoutJson; // Stores layout in JSON format

    // Getters and Setters
}
