package prototype_pattern.model;

import java.io.*;
import java.sql.Timestamp;
import java.util.Date;

/**
 *  model
 */
public class FieldNotes implements Cloneable, Serializable {
	
	private String field_notes_id;
	private String struts;
	private String jx_plan_item_id;
	private String full_name;
	private String sys_user_id;
	private Timestamp come_on_time;
	private String cm_gps;
	private Timestamp lc_field_time;
	private String lc_gps;
	private String remark;
	private String station_name;
	private String problem;
	private String correction_proposals;
	private String punish_proposals;

	public String getField_notes_id() {
		return field_notes_id;
	}

	public void setField_notes_id(String field_notes_id) {
		this.field_notes_id = field_notes_id;
	}

	public String getStruts() {
		return struts;
	}

	public void setStruts(String struts) {
		this.struts = struts;
	}

	public String getJx_plan_item_id() {
		return jx_plan_item_id;
	}

	public void setJx_plan_item_id(String jx_plan_item_id) {
		this.jx_plan_item_id = jx_plan_item_id;
	}

	public String getFull_name() {
		return full_name;
	}

	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}

	public String getSys_user_id() {
		return sys_user_id;
	}

	public void setSys_user_id(String sys_user_id) {
		this.sys_user_id = sys_user_id;
	}

	public Timestamp getCome_on_time() {
		return come_on_time;
	}

	public void setCome_on_time(Timestamp come_on_time) {
		this.come_on_time = come_on_time;
	}

	public String getCm_gps() {
		return cm_gps;
	}

	public void setCm_gps(String cm_gps) {
		this.cm_gps = cm_gps;
	}

	public Timestamp getLc_field_time() {
		return lc_field_time;
	}

	public void setLc_field_time(Timestamp lc_field_time) {
		this.lc_field_time = lc_field_time;
	}

	public String getLc_gps() {
		return lc_gps;
	}

	public void setLc_gps(String lc_gps) {
		this.lc_gps = lc_gps;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getStation_name() {
		return station_name;
	}

	public void setStation_name(String station_name) {
		this.station_name = station_name;
	}

	public String getProblem() {
		return problem;
	}

	public void setProblem(String problem) {
		this.problem = problem;
	}

	public String getCorrection_proposals() {
		return correction_proposals;
	}

	public void setCorrection_proposals(String correction_proposals) {
		this.correction_proposals = correction_proposals;
	}

	public String getPunish_proposals() {
		return punish_proposals;
	}

	public void setPunish_proposals(String punish_proposals) {
		this.punish_proposals = punish_proposals;
	}

	public FieldNotes() {
		this.field_notes_id = "field_notes_id";
		this.struts = "struts";
		this.jx_plan_item_id = "jx_plan_item_id";
		this.full_name = "full_name";
		this.sys_user_id = "sys_user_id";
		this.come_on_time = new Timestamp(new Date().getTime());
		this.cm_gps = "cm_gps";
		this.lc_field_time = new Timestamp(new Date().getTime());
		this.lc_gps = "lc_gps";
		this.remark = "remark";
		this.station_name = "station_name";
		this.problem = "problem";
		this.correction_proposals = "correction_proposals";
		this.punish_proposals = "punish_proposals";
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return this.deepClone();
	}

	private Object deepClone() {
		ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
		try {
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
			objectOutputStream.writeObject(this);
			objectOutputStream.flush();
			objectOutputStream.close();

			ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
			ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
			Object o=objectInputStream.readObject();
			objectInputStream.close();
			return o;
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}
	public Object shawllowClone(){
		FieldNotes fieldNotes = new FieldNotes();
		fieldNotes.setCm_gps(this.cm_gps);
		fieldNotes.setCome_on_time(this.come_on_time);
		fieldNotes.setCorrection_proposals(this.correction_proposals);
		fieldNotes.setField_notes_id(this.field_notes_id);
		fieldNotes.setFull_name(this.full_name);
		fieldNotes.setJx_plan_item_id(this.jx_plan_item_id);
		fieldNotes.setLc_field_time(this.lc_field_time);
		fieldNotes.setLc_gps(this.lc_gps);
		fieldNotes.setProblem(this.problem);
		fieldNotes.setPunish_proposals(this.punish_proposals);
		fieldNotes.setRemark(this.remark);
		fieldNotes.setStation_name(this.station_name);
		fieldNotes.setStruts(this.struts);
		fieldNotes.setSys_user_id(this.sys_user_id);
		return fieldNotes;
	}
}
