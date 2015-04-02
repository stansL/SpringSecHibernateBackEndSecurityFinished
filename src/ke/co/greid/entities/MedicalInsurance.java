package ke.co.greid.entities;

// Generated Apr 1, 2015 12:52:51 PM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * MedicalInsurance generated by hbm2java
 */
@Entity
@Table(name = "medical_insurance", catalog = "hims")
public class MedicalInsurance implements java.io.Serializable {

	private Integer medicalInsuranceId;
	private String schemeName;
	private String insurer;
	private String schemeAccount;
	private Set<PatientHasMedicalInsurance> patientHasMedicalInsurances = new HashSet<PatientHasMedicalInsurance>(
			0);

	public MedicalInsurance() {
	}

	public MedicalInsurance(String schemeName, String insurer,
			String schemeAccount,
			Set<PatientHasMedicalInsurance> patientHasMedicalInsurances) {
		this.schemeName = schemeName;
		this.insurer = insurer;
		this.schemeAccount = schemeAccount;
		this.patientHasMedicalInsurances = patientHasMedicalInsurances;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "medical_insurance_id", unique = true, nullable = false)
	public Integer getMedicalInsuranceId() {
		return this.medicalInsuranceId;
	}

	public void setMedicalInsuranceId(Integer medicalInsuranceId) {
		this.medicalInsuranceId = medicalInsuranceId;
	}

	@Column(name = "scheme_name", length = 45)
	public String getSchemeName() {
		return this.schemeName;
	}

	public void setSchemeName(String schemeName) {
		this.schemeName = schemeName;
	}

	@Column(name = "insurer", length = 45)
	public String getInsurer() {
		return this.insurer;
	}

	public void setInsurer(String insurer) {
		this.insurer = insurer;
	}

	@Column(name = "scheme_account", length = 45)
	public String getSchemeAccount() {
		return this.schemeAccount;
	}

	public void setSchemeAccount(String schemeAccount) {
		this.schemeAccount = schemeAccount;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "medicalInsurance")
	public Set<PatientHasMedicalInsurance> getPatientHasMedicalInsurances() {
		return this.patientHasMedicalInsurances;
	}

	public void setPatientHasMedicalInsurances(
			Set<PatientHasMedicalInsurance> patientHasMedicalInsurances) {
		this.patientHasMedicalInsurances = patientHasMedicalInsurances;
	}

}
