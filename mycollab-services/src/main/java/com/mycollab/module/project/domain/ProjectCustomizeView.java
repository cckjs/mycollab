/**
 * This file is part of mycollab-services.
 *
 * mycollab-services is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * mycollab-services is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with mycollab-services.  If not, see <http://www.gnu.org/licenses/>.
 */
/*Domain class of table m_prj_customize_view*/
package com.mycollab.module.project.domain;

import com.mycollab.core.arguments.ValuedBean;
import com.mycollab.db.metadata.Column;
import com.mycollab.db.metadata.Table;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@SuppressWarnings("ucd")
@Table("m_prj_customize_view")
public class ProjectCustomizeView extends ValuedBean {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_customize_view.id
     *
     * @mbggenerated Thu Aug 04 14:09:20 ICT 2016
     */
    @Column("id")
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_customize_view.projectId
     *
     * @mbggenerated Thu Aug 04 14:09:20 ICT 2016
     */
    @Column("projectId")
    private Integer projectid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_customize_view.displayMessage
     *
     * @mbggenerated Thu Aug 04 14:09:20 ICT 2016
     */
    @Column("displayMessage")
    private Boolean displaymessage;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_customize_view.displayMilestone
     *
     * @mbggenerated Thu Aug 04 14:09:20 ICT 2016
     */
    @Column("displayMilestone")
    private Boolean displaymilestone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_customize_view.displayTask
     *
     * @mbggenerated Thu Aug 04 14:09:20 ICT 2016
     */
    @Column("displayTask")
    private Boolean displaytask;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_customize_view.displayBug
     *
     * @mbggenerated Thu Aug 04 14:09:20 ICT 2016
     */
    @Column("displayBug")
    private Boolean displaybug;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_customize_view.displayStandup
     *
     * @mbggenerated Thu Aug 04 14:09:20 ICT 2016
     */
    @Column("displayStandup")
    private Boolean displaystandup;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_customize_view.displayRisk
     *
     * @mbggenerated Thu Aug 04 14:09:20 ICT 2016
     */
    @Column("displayRisk")
    private Boolean displayrisk;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_customize_view.displayTimeLogging
     *
     * @mbggenerated Thu Aug 04 14:09:20 ICT 2016
     */
    @Column("displayTimeLogging")
    private Boolean displaytimelogging;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_customize_view.displayPage
     *
     * @mbggenerated Thu Aug 04 14:09:20 ICT 2016
     */
    @Column("displayPage")
    private Boolean displaypage;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_customize_view.displayFile
     *
     * @mbggenerated Thu Aug 04 14:09:20 ICT 2016
     */
    @Column("displayFile")
    private Boolean displayfile;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_customize_view.displayInvoice
     *
     * @mbggenerated Thu Aug 04 14:09:20 ICT 2016
     */
    @Column("displayInvoice")
    private Boolean displayinvoice;

    private static final long serialVersionUID = 1;

    public final boolean equals(Object obj) {
        if (obj == null) { return false;}
        if (obj == this) { return true;}
        if (!obj.getClass().isAssignableFrom(getClass())) { return false;}
        ProjectCustomizeView item = (ProjectCustomizeView)obj;
        return new EqualsBuilder().append(id, item.id).build();
    }

    public final int hashCode() {
        return new HashCodeBuilder(601, 1381).append(id).build();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_customize_view.id
     *
     * @return the value of m_prj_customize_view.id
     *
     * @mbggenerated Thu Aug 04 14:09:20 ICT 2016
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_customize_view.id
     *
     * @param id the value for m_prj_customize_view.id
     *
     * @mbggenerated Thu Aug 04 14:09:20 ICT 2016
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_customize_view.projectId
     *
     * @return the value of m_prj_customize_view.projectId
     *
     * @mbggenerated Thu Aug 04 14:09:20 ICT 2016
     */
    public Integer getProjectid() {
        return projectid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_customize_view.projectId
     *
     * @param projectid the value for m_prj_customize_view.projectId
     *
     * @mbggenerated Thu Aug 04 14:09:20 ICT 2016
     */
    public void setProjectid(Integer projectid) {
        this.projectid = projectid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_customize_view.displayMessage
     *
     * @return the value of m_prj_customize_view.displayMessage
     *
     * @mbggenerated Thu Aug 04 14:09:20 ICT 2016
     */
    public Boolean getDisplaymessage() {
        return displaymessage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_customize_view.displayMessage
     *
     * @param displaymessage the value for m_prj_customize_view.displayMessage
     *
     * @mbggenerated Thu Aug 04 14:09:20 ICT 2016
     */
    public void setDisplaymessage(Boolean displaymessage) {
        this.displaymessage = displaymessage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_customize_view.displayMilestone
     *
     * @return the value of m_prj_customize_view.displayMilestone
     *
     * @mbggenerated Thu Aug 04 14:09:20 ICT 2016
     */
    public Boolean getDisplaymilestone() {
        return displaymilestone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_customize_view.displayMilestone
     *
     * @param displaymilestone the value for m_prj_customize_view.displayMilestone
     *
     * @mbggenerated Thu Aug 04 14:09:20 ICT 2016
     */
    public void setDisplaymilestone(Boolean displaymilestone) {
        this.displaymilestone = displaymilestone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_customize_view.displayTask
     *
     * @return the value of m_prj_customize_view.displayTask
     *
     * @mbggenerated Thu Aug 04 14:09:20 ICT 2016
     */
    public Boolean getDisplaytask() {
        return displaytask;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_customize_view.displayTask
     *
     * @param displaytask the value for m_prj_customize_view.displayTask
     *
     * @mbggenerated Thu Aug 04 14:09:20 ICT 2016
     */
    public void setDisplaytask(Boolean displaytask) {
        this.displaytask = displaytask;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_customize_view.displayBug
     *
     * @return the value of m_prj_customize_view.displayBug
     *
     * @mbggenerated Thu Aug 04 14:09:20 ICT 2016
     */
    public Boolean getDisplaybug() {
        return displaybug;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_customize_view.displayBug
     *
     * @param displaybug the value for m_prj_customize_view.displayBug
     *
     * @mbggenerated Thu Aug 04 14:09:20 ICT 2016
     */
    public void setDisplaybug(Boolean displaybug) {
        this.displaybug = displaybug;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_customize_view.displayStandup
     *
     * @return the value of m_prj_customize_view.displayStandup
     *
     * @mbggenerated Thu Aug 04 14:09:20 ICT 2016
     */
    public Boolean getDisplaystandup() {
        return displaystandup;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_customize_view.displayStandup
     *
     * @param displaystandup the value for m_prj_customize_view.displayStandup
     *
     * @mbggenerated Thu Aug 04 14:09:20 ICT 2016
     */
    public void setDisplaystandup(Boolean displaystandup) {
        this.displaystandup = displaystandup;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_customize_view.displayRisk
     *
     * @return the value of m_prj_customize_view.displayRisk
     *
     * @mbggenerated Thu Aug 04 14:09:20 ICT 2016
     */
    public Boolean getDisplayrisk() {
        return displayrisk;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_customize_view.displayRisk
     *
     * @param displayrisk the value for m_prj_customize_view.displayRisk
     *
     * @mbggenerated Thu Aug 04 14:09:20 ICT 2016
     */
    public void setDisplayrisk(Boolean displayrisk) {
        this.displayrisk = displayrisk;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_customize_view.displayTimeLogging
     *
     * @return the value of m_prj_customize_view.displayTimeLogging
     *
     * @mbggenerated Thu Aug 04 14:09:20 ICT 2016
     */
    public Boolean getDisplaytimelogging() {
        return displaytimelogging;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_customize_view.displayTimeLogging
     *
     * @param displaytimelogging the value for m_prj_customize_view.displayTimeLogging
     *
     * @mbggenerated Thu Aug 04 14:09:20 ICT 2016
     */
    public void setDisplaytimelogging(Boolean displaytimelogging) {
        this.displaytimelogging = displaytimelogging;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_customize_view.displayPage
     *
     * @return the value of m_prj_customize_view.displayPage
     *
     * @mbggenerated Thu Aug 04 14:09:20 ICT 2016
     */
    public Boolean getDisplaypage() {
        return displaypage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_customize_view.displayPage
     *
     * @param displaypage the value for m_prj_customize_view.displayPage
     *
     * @mbggenerated Thu Aug 04 14:09:20 ICT 2016
     */
    public void setDisplaypage(Boolean displaypage) {
        this.displaypage = displaypage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_customize_view.displayFile
     *
     * @return the value of m_prj_customize_view.displayFile
     *
     * @mbggenerated Thu Aug 04 14:09:20 ICT 2016
     */
    public Boolean getDisplayfile() {
        return displayfile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_customize_view.displayFile
     *
     * @param displayfile the value for m_prj_customize_view.displayFile
     *
     * @mbggenerated Thu Aug 04 14:09:20 ICT 2016
     */
    public void setDisplayfile(Boolean displayfile) {
        this.displayfile = displayfile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_customize_view.displayInvoice
     *
     * @return the value of m_prj_customize_view.displayInvoice
     *
     * @mbggenerated Thu Aug 04 14:09:20 ICT 2016
     */
    public Boolean getDisplayinvoice() {
        return displayinvoice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_customize_view.displayInvoice
     *
     * @param displayinvoice the value for m_prj_customize_view.displayInvoice
     *
     * @mbggenerated Thu Aug 04 14:09:20 ICT 2016
     */
    public void setDisplayinvoice(Boolean displayinvoice) {
        this.displayinvoice = displayinvoice;
    }

    public enum Field {
        id,
        projectid,
        displaymessage,
        displaymilestone,
        displaytask,
        displaybug,
        displaystandup,
        displayrisk,
        displaytimelogging,
        displaypage,
        displayfile,
        displayinvoice;

        public boolean equalTo(Object value) {
            return name().equals(value);
        }
    }
}