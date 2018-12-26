package pik.clinic.clinicproject.View;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.polymertemplate.EventHandler;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.templatemodel.TemplateModel;
import org.springframework.beans.factory.annotation.Autowired;
import pik.clinic.clinicproject.Model.Patient;
import pik.clinic.clinicproject.Repositories.PatientRepository;


/**
 * A Designer generated component for the admin-view.html template.
 * <p>
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Route("adminview")
@Tag("admin-view")
@HtmlImport("admin-view.html")
public class AdminView extends PolymerTemplate<AdminView.AdminViewModel> {

    @Autowired
    PatientRepository patientRepository;

    @Id("add")
    private Button add;
    @Id("pesel1")
    private TextField pesel1;
    @Id("firstName1")
    private TextField firstName1;
    @Id("lastName1")
    private TextField lastName1;
    @Id("email1")
    private TextField email1;
    @Id("phoneNumber1")
    private TextField phoneNumber1;
    @Id("address1")
    private TextField address1;

    public AdminView() {
        // You can initialise any data required for the connected UI components here.
        /*add.addClickListener(buttonClickEvent -> {
            Patient p = new Patient(firstName1.getValue(), lastName1.getValue(), Long.parseLong(pesel1.getValue()), Integer.parseInt(phoneNumber1.getValue()), address1.getValue(), email1.getValue());
            patientRepository.save(p);
        });*/
    }

    /**
     * Creates a new AdminView.
     */
    @EventHandler
    public void addPatient() {
        Patient p = new Patient();
        p.setFirstName(firstName1.getValue());
        p.setFirstName(lastName1.getValue());
        p.setFirstName(pesel1.getValue());
        p.setFirstName(phoneNumber1.getValue());
        p.setFirstName(address1.getValue());
        p.setFirstName(email1.getValue());
    }

    /**
     * This model binds properties between AdminView and admin-view.html
     */
    public interface AdminViewModel extends TemplateModel {
        // Add setters and getters for template properties here.

    }
}
