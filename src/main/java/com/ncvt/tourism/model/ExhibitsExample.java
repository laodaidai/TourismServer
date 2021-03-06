package com.ncvt.tourism.model;

import java.util.ArrayList;
import java.util.List;

public class ExhibitsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ExhibitsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andExhibitsIdIsNull() {
            addCriterion("exhibits_id is null");
            return (Criteria) this;
        }

        public Criteria andExhibitsIdIsNotNull() {
            addCriterion("exhibits_id is not null");
            return (Criteria) this;
        }

        public Criteria andExhibitsIdEqualTo(Integer value) {
            addCriterion("exhibits_id =", value, "exhibitsId");
            return (Criteria) this;
        }

        public Criteria andExhibitsIdNotEqualTo(Integer value) {
            addCriterion("exhibits_id <>", value, "exhibitsId");
            return (Criteria) this;
        }

        public Criteria andExhibitsIdGreaterThan(Integer value) {
            addCriterion("exhibits_id >", value, "exhibitsId");
            return (Criteria) this;
        }

        public Criteria andExhibitsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("exhibits_id >=", value, "exhibitsId");
            return (Criteria) this;
        }

        public Criteria andExhibitsIdLessThan(Integer value) {
            addCriterion("exhibits_id <", value, "exhibitsId");
            return (Criteria) this;
        }

        public Criteria andExhibitsIdLessThanOrEqualTo(Integer value) {
            addCriterion("exhibits_id <=", value, "exhibitsId");
            return (Criteria) this;
        }

        public Criteria andExhibitsIdIn(List<Integer> values) {
            addCriterion("exhibits_id in", values, "exhibitsId");
            return (Criteria) this;
        }

        public Criteria andExhibitsIdNotIn(List<Integer> values) {
            addCriterion("exhibits_id not in", values, "exhibitsId");
            return (Criteria) this;
        }

        public Criteria andExhibitsIdBetween(Integer value1, Integer value2) {
            addCriterion("exhibits_id between", value1, value2, "exhibitsId");
            return (Criteria) this;
        }

        public Criteria andExhibitsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("exhibits_id not between", value1, value2, "exhibitsId");
            return (Criteria) this;
        }

        public Criteria andExhibitionAreaIdIsNull() {
            addCriterion("exhibition_area_id is null");
            return (Criteria) this;
        }

        public Criteria andExhibitionAreaIdIsNotNull() {
            addCriterion("exhibition_area_id is not null");
            return (Criteria) this;
        }

        public Criteria andExhibitionAreaIdEqualTo(Integer value) {
            addCriterion("exhibition_area_id =", value, "exhibitionAreaId");
            return (Criteria) this;
        }

        public Criteria andExhibitionAreaIdNotEqualTo(Integer value) {
            addCriterion("exhibition_area_id <>", value, "exhibitionAreaId");
            return (Criteria) this;
        }

        public Criteria andExhibitionAreaIdGreaterThan(Integer value) {
            addCriterion("exhibition_area_id >", value, "exhibitionAreaId");
            return (Criteria) this;
        }

        public Criteria andExhibitionAreaIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("exhibition_area_id >=", value, "exhibitionAreaId");
            return (Criteria) this;
        }

        public Criteria andExhibitionAreaIdLessThan(Integer value) {
            addCriterion("exhibition_area_id <", value, "exhibitionAreaId");
            return (Criteria) this;
        }

        public Criteria andExhibitionAreaIdLessThanOrEqualTo(Integer value) {
            addCriterion("exhibition_area_id <=", value, "exhibitionAreaId");
            return (Criteria) this;
        }

        public Criteria andExhibitionAreaIdIn(List<Integer> values) {
            addCriterion("exhibition_area_id in", values, "exhibitionAreaId");
            return (Criteria) this;
        }

        public Criteria andExhibitionAreaIdNotIn(List<Integer> values) {
            addCriterion("exhibition_area_id not in", values, "exhibitionAreaId");
            return (Criteria) this;
        }

        public Criteria andExhibitionAreaIdBetween(Integer value1, Integer value2) {
            addCriterion("exhibition_area_id between", value1, value2, "exhibitionAreaId");
            return (Criteria) this;
        }

        public Criteria andExhibitionAreaIdNotBetween(Integer value1, Integer value2) {
            addCriterion("exhibition_area_id not between", value1, value2, "exhibitionAreaId");
            return (Criteria) this;
        }

        public Criteria andExhibitsNameIsNull() {
            addCriterion("exhibits_name is null");
            return (Criteria) this;
        }

        public Criteria andExhibitsNameIsNotNull() {
            addCriterion("exhibits_name is not null");
            return (Criteria) this;
        }

        public Criteria andExhibitsNameEqualTo(String value) {
            addCriterion("exhibits_name =", value, "exhibitsName");
            return (Criteria) this;
        }

        public Criteria andExhibitsNameNotEqualTo(String value) {
            addCriterion("exhibits_name <>", value, "exhibitsName");
            return (Criteria) this;
        }

        public Criteria andExhibitsNameGreaterThan(String value) {
            addCriterion("exhibits_name >", value, "exhibitsName");
            return (Criteria) this;
        }

        public Criteria andExhibitsNameGreaterThanOrEqualTo(String value) {
            addCriterion("exhibits_name >=", value, "exhibitsName");
            return (Criteria) this;
        }

        public Criteria andExhibitsNameLessThan(String value) {
            addCriterion("exhibits_name <", value, "exhibitsName");
            return (Criteria) this;
        }

        public Criteria andExhibitsNameLessThanOrEqualTo(String value) {
            addCriterion("exhibits_name <=", value, "exhibitsName");
            return (Criteria) this;
        }

        public Criteria andExhibitsNameLike(String value) {
            addCriterion("exhibits_name like", value, "exhibitsName");
            return (Criteria) this;
        }

        public Criteria andExhibitsNameNotLike(String value) {
            addCriterion("exhibits_name not like", value, "exhibitsName");
            return (Criteria) this;
        }

        public Criteria andExhibitsNameIn(List<String> values) {
            addCriterion("exhibits_name in", values, "exhibitsName");
            return (Criteria) this;
        }

        public Criteria andExhibitsNameNotIn(List<String> values) {
            addCriterion("exhibits_name not in", values, "exhibitsName");
            return (Criteria) this;
        }

        public Criteria andExhibitsNameBetween(String value1, String value2) {
            addCriterion("exhibits_name between", value1, value2, "exhibitsName");
            return (Criteria) this;
        }

        public Criteria andExhibitsNameNotBetween(String value1, String value2) {
            addCriterion("exhibits_name not between", value1, value2, "exhibitsName");
            return (Criteria) this;
        }

        public Criteria andExhibitsVideoUrlIsNull() {
            addCriterion("exhibits_video_url is null");
            return (Criteria) this;
        }

        public Criteria andExhibitsVideoUrlIsNotNull() {
            addCriterion("exhibits_video_url is not null");
            return (Criteria) this;
        }

        public Criteria andExhibitsVideoUrlEqualTo(String value) {
            addCriterion("exhibits_video_url =", value, "exhibitsVideoUrl");
            return (Criteria) this;
        }

        public Criteria andExhibitsVideoUrlNotEqualTo(String value) {
            addCriterion("exhibits_video_url <>", value, "exhibitsVideoUrl");
            return (Criteria) this;
        }

        public Criteria andExhibitsVideoUrlGreaterThan(String value) {
            addCriterion("exhibits_video_url >", value, "exhibitsVideoUrl");
            return (Criteria) this;
        }

        public Criteria andExhibitsVideoUrlGreaterThanOrEqualTo(String value) {
            addCriterion("exhibits_video_url >=", value, "exhibitsVideoUrl");
            return (Criteria) this;
        }

        public Criteria andExhibitsVideoUrlLessThan(String value) {
            addCriterion("exhibits_video_url <", value, "exhibitsVideoUrl");
            return (Criteria) this;
        }

        public Criteria andExhibitsVideoUrlLessThanOrEqualTo(String value) {
            addCriterion("exhibits_video_url <=", value, "exhibitsVideoUrl");
            return (Criteria) this;
        }

        public Criteria andExhibitsVideoUrlLike(String value) {
            addCriterion("exhibits_video_url like", value, "exhibitsVideoUrl");
            return (Criteria) this;
        }

        public Criteria andExhibitsVideoUrlNotLike(String value) {
            addCriterion("exhibits_video_url not like", value, "exhibitsVideoUrl");
            return (Criteria) this;
        }

        public Criteria andExhibitsVideoUrlIn(List<String> values) {
            addCriterion("exhibits_video_url in", values, "exhibitsVideoUrl");
            return (Criteria) this;
        }

        public Criteria andExhibitsVideoUrlNotIn(List<String> values) {
            addCriterion("exhibits_video_url not in", values, "exhibitsVideoUrl");
            return (Criteria) this;
        }

        public Criteria andExhibitsVideoUrlBetween(String value1, String value2) {
            addCriterion("exhibits_video_url between", value1, value2, "exhibitsVideoUrl");
            return (Criteria) this;
        }

        public Criteria andExhibitsVideoUrlNotBetween(String value1, String value2) {
            addCriterion("exhibits_video_url not between", value1, value2, "exhibitsVideoUrl");
            return (Criteria) this;
        }

        public Criteria andExhibitsInformationIsNull() {
            addCriterion("exhibits_information is null");
            return (Criteria) this;
        }

        public Criteria andExhibitsInformationIsNotNull() {
            addCriterion("exhibits_information is not null");
            return (Criteria) this;
        }

        public Criteria andExhibitsInformationEqualTo(String value) {
            addCriterion("exhibits_information =", value, "exhibitsInformation");
            return (Criteria) this;
        }

        public Criteria andExhibitsInformationNotEqualTo(String value) {
            addCriterion("exhibits_information <>", value, "exhibitsInformation");
            return (Criteria) this;
        }

        public Criteria andExhibitsInformationGreaterThan(String value) {
            addCriterion("exhibits_information >", value, "exhibitsInformation");
            return (Criteria) this;
        }

        public Criteria andExhibitsInformationGreaterThanOrEqualTo(String value) {
            addCriterion("exhibits_information >=", value, "exhibitsInformation");
            return (Criteria) this;
        }

        public Criteria andExhibitsInformationLessThan(String value) {
            addCriterion("exhibits_information <", value, "exhibitsInformation");
            return (Criteria) this;
        }

        public Criteria andExhibitsInformationLessThanOrEqualTo(String value) {
            addCriterion("exhibits_information <=", value, "exhibitsInformation");
            return (Criteria) this;
        }

        public Criteria andExhibitsInformationLike(String value) {
            addCriterion("exhibits_information like", value, "exhibitsInformation");
            return (Criteria) this;
        }

        public Criteria andExhibitsInformationNotLike(String value) {
            addCriterion("exhibits_information not like", value, "exhibitsInformation");
            return (Criteria) this;
        }

        public Criteria andExhibitsInformationIn(List<String> values) {
            addCriterion("exhibits_information in", values, "exhibitsInformation");
            return (Criteria) this;
        }

        public Criteria andExhibitsInformationNotIn(List<String> values) {
            addCriterion("exhibits_information not in", values, "exhibitsInformation");
            return (Criteria) this;
        }

        public Criteria andExhibitsInformationBetween(String value1, String value2) {
            addCriterion("exhibits_information between", value1, value2, "exhibitsInformation");
            return (Criteria) this;
        }

        public Criteria andExhibitsInformationNotBetween(String value1, String value2) {
            addCriterion("exhibits_information not between", value1, value2, "exhibitsInformation");
            return (Criteria) this;
        }

        public Criteria andExhibitsAuthorIsNull() {
            addCriterion("exhibits_author is null");
            return (Criteria) this;
        }

        public Criteria andExhibitsAuthorIsNotNull() {
            addCriterion("exhibits_author is not null");
            return (Criteria) this;
        }

        public Criteria andExhibitsAuthorEqualTo(String value) {
            addCriterion("exhibits_author =", value, "exhibitsAuthor");
            return (Criteria) this;
        }

        public Criteria andExhibitsAuthorNotEqualTo(String value) {
            addCriterion("exhibits_author <>", value, "exhibitsAuthor");
            return (Criteria) this;
        }

        public Criteria andExhibitsAuthorGreaterThan(String value) {
            addCriterion("exhibits_author >", value, "exhibitsAuthor");
            return (Criteria) this;
        }

        public Criteria andExhibitsAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("exhibits_author >=", value, "exhibitsAuthor");
            return (Criteria) this;
        }

        public Criteria andExhibitsAuthorLessThan(String value) {
            addCriterion("exhibits_author <", value, "exhibitsAuthor");
            return (Criteria) this;
        }

        public Criteria andExhibitsAuthorLessThanOrEqualTo(String value) {
            addCriterion("exhibits_author <=", value, "exhibitsAuthor");
            return (Criteria) this;
        }

        public Criteria andExhibitsAuthorLike(String value) {
            addCriterion("exhibits_author like", value, "exhibitsAuthor");
            return (Criteria) this;
        }

        public Criteria andExhibitsAuthorNotLike(String value) {
            addCriterion("exhibits_author not like", value, "exhibitsAuthor");
            return (Criteria) this;
        }

        public Criteria andExhibitsAuthorIn(List<String> values) {
            addCriterion("exhibits_author in", values, "exhibitsAuthor");
            return (Criteria) this;
        }

        public Criteria andExhibitsAuthorNotIn(List<String> values) {
            addCriterion("exhibits_author not in", values, "exhibitsAuthor");
            return (Criteria) this;
        }

        public Criteria andExhibitsAuthorBetween(String value1, String value2) {
            addCriterion("exhibits_author between", value1, value2, "exhibitsAuthor");
            return (Criteria) this;
        }

        public Criteria andExhibitsAuthorNotBetween(String value1, String value2) {
            addCriterion("exhibits_author not between", value1, value2, "exhibitsAuthor");
            return (Criteria) this;
        }

        public Criteria andCellPhoneNumberIsNull() {
            addCriterion("cell_phone_number is null");
            return (Criteria) this;
        }

        public Criteria andCellPhoneNumberIsNotNull() {
            addCriterion("cell_phone_number is not null");
            return (Criteria) this;
        }

        public Criteria andCellPhoneNumberEqualTo(String value) {
            addCriterion("cell_phone_number =", value, "cellPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andCellPhoneNumberNotEqualTo(String value) {
            addCriterion("cell_phone_number <>", value, "cellPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andCellPhoneNumberGreaterThan(String value) {
            addCriterion("cell_phone_number >", value, "cellPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andCellPhoneNumberGreaterThanOrEqualTo(String value) {
            addCriterion("cell_phone_number >=", value, "cellPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andCellPhoneNumberLessThan(String value) {
            addCriterion("cell_phone_number <", value, "cellPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andCellPhoneNumberLessThanOrEqualTo(String value) {
            addCriterion("cell_phone_number <=", value, "cellPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andCellPhoneNumberLike(String value) {
            addCriterion("cell_phone_number like", value, "cellPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andCellPhoneNumberNotLike(String value) {
            addCriterion("cell_phone_number not like", value, "cellPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andCellPhoneNumberIn(List<String> values) {
            addCriterion("cell_phone_number in", values, "cellPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andCellPhoneNumberNotIn(List<String> values) {
            addCriterion("cell_phone_number not in", values, "cellPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andCellPhoneNumberBetween(String value1, String value2) {
            addCriterion("cell_phone_number between", value1, value2, "cellPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andCellPhoneNumberNotBetween(String value1, String value2) {
            addCriterion("cell_phone_number not between", value1, value2, "cellPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andGuidanceTeacherIsNull() {
            addCriterion("guidance_teacher is null");
            return (Criteria) this;
        }

        public Criteria andGuidanceTeacherIsNotNull() {
            addCriterion("guidance_teacher is not null");
            return (Criteria) this;
        }

        public Criteria andGuidanceTeacherEqualTo(String value) {
            addCriterion("guidance_teacher =", value, "guidanceTeacher");
            return (Criteria) this;
        }

        public Criteria andGuidanceTeacherNotEqualTo(String value) {
            addCriterion("guidance_teacher <>", value, "guidanceTeacher");
            return (Criteria) this;
        }

        public Criteria andGuidanceTeacherGreaterThan(String value) {
            addCriterion("guidance_teacher >", value, "guidanceTeacher");
            return (Criteria) this;
        }

        public Criteria andGuidanceTeacherGreaterThanOrEqualTo(String value) {
            addCriterion("guidance_teacher >=", value, "guidanceTeacher");
            return (Criteria) this;
        }

        public Criteria andGuidanceTeacherLessThan(String value) {
            addCriterion("guidance_teacher <", value, "guidanceTeacher");
            return (Criteria) this;
        }

        public Criteria andGuidanceTeacherLessThanOrEqualTo(String value) {
            addCriterion("guidance_teacher <=", value, "guidanceTeacher");
            return (Criteria) this;
        }

        public Criteria andGuidanceTeacherLike(String value) {
            addCriterion("guidance_teacher like", value, "guidanceTeacher");
            return (Criteria) this;
        }

        public Criteria andGuidanceTeacherNotLike(String value) {
            addCriterion("guidance_teacher not like", value, "guidanceTeacher");
            return (Criteria) this;
        }

        public Criteria andGuidanceTeacherIn(List<String> values) {
            addCriterion("guidance_teacher in", values, "guidanceTeacher");
            return (Criteria) this;
        }

        public Criteria andGuidanceTeacherNotIn(List<String> values) {
            addCriterion("guidance_teacher not in", values, "guidanceTeacher");
            return (Criteria) this;
        }

        public Criteria andGuidanceTeacherBetween(String value1, String value2) {
            addCriterion("guidance_teacher between", value1, value2, "guidanceTeacher");
            return (Criteria) this;
        }

        public Criteria andGuidanceTeacherNotBetween(String value1, String value2) {
            addCriterion("guidance_teacher not between", value1, value2, "guidanceTeacher");
            return (Criteria) this;
        }

        public Criteria andTeamMembersIsNull() {
            addCriterion("team_members is null");
            return (Criteria) this;
        }

        public Criteria andTeamMembersIsNotNull() {
            addCriterion("team_members is not null");
            return (Criteria) this;
        }

        public Criteria andTeamMembersEqualTo(String value) {
            addCriterion("team_members =", value, "teamMembers");
            return (Criteria) this;
        }

        public Criteria andTeamMembersNotEqualTo(String value) {
            addCriterion("team_members <>", value, "teamMembers");
            return (Criteria) this;
        }

        public Criteria andTeamMembersGreaterThan(String value) {
            addCriterion("team_members >", value, "teamMembers");
            return (Criteria) this;
        }

        public Criteria andTeamMembersGreaterThanOrEqualTo(String value) {
            addCriterion("team_members >=", value, "teamMembers");
            return (Criteria) this;
        }

        public Criteria andTeamMembersLessThan(String value) {
            addCriterion("team_members <", value, "teamMembers");
            return (Criteria) this;
        }

        public Criteria andTeamMembersLessThanOrEqualTo(String value) {
            addCriterion("team_members <=", value, "teamMembers");
            return (Criteria) this;
        }

        public Criteria andTeamMembersLike(String value) {
            addCriterion("team_members like", value, "teamMembers");
            return (Criteria) this;
        }

        public Criteria andTeamMembersNotLike(String value) {
            addCriterion("team_members not like", value, "teamMembers");
            return (Criteria) this;
        }

        public Criteria andTeamMembersIn(List<String> values) {
            addCriterion("team_members in", values, "teamMembers");
            return (Criteria) this;
        }

        public Criteria andTeamMembersNotIn(List<String> values) {
            addCriterion("team_members not in", values, "teamMembers");
            return (Criteria) this;
        }

        public Criteria andTeamMembersBetween(String value1, String value2) {
            addCriterion("team_members between", value1, value2, "teamMembers");
            return (Criteria) this;
        }

        public Criteria andTeamMembersNotBetween(String value1, String value2) {
            addCriterion("team_members not between", value1, value2, "teamMembers");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}