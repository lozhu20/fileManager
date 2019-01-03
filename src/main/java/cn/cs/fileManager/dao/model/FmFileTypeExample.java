package cn.cs.fileManager.dao.model;

import java.util.ArrayList;
import java.util.List;

public class FmFileTypeExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table fm_file_type
	 * @mbg.generated  Thu Dec 20 16:13:57 CST 2018
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table fm_file_type
	 * @mbg.generated  Thu Dec 20 16:13:57 CST 2018
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table fm_file_type
	 * @mbg.generated  Thu Dec 20 16:13:57 CST 2018
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table fm_file_type
	 * @mbg.generated  Thu Dec 20 16:13:57 CST 2018
	 */
	public FmFileTypeExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table fm_file_type
	 * @mbg.generated  Thu Dec 20 16:13:57 CST 2018
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table fm_file_type
	 * @mbg.generated  Thu Dec 20 16:13:57 CST 2018
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table fm_file_type
	 * @mbg.generated  Thu Dec 20 16:13:57 CST 2018
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table fm_file_type
	 * @mbg.generated  Thu Dec 20 16:13:57 CST 2018
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table fm_file_type
	 * @mbg.generated  Thu Dec 20 16:13:57 CST 2018
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table fm_file_type
	 * @mbg.generated  Thu Dec 20 16:13:57 CST 2018
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table fm_file_type
	 * @mbg.generated  Thu Dec 20 16:13:57 CST 2018
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table fm_file_type
	 * @mbg.generated  Thu Dec 20 16:13:57 CST 2018
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table fm_file_type
	 * @mbg.generated  Thu Dec 20 16:13:57 CST 2018
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table fm_file_type
	 * @mbg.generated  Thu Dec 20 16:13:57 CST 2018
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table fm_file_type
	 * @mbg.generated  Thu Dec 20 16:13:57 CST 2018
	 */
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

		public Criteria andIdIsNull() {
			addCriterion("id is null");
			return (Criteria) this;
		}

		public Criteria andIdIsNotNull() {
			addCriterion("id is not null");
			return (Criteria) this;
		}

		public Criteria andIdEqualTo(Long value) {
			addCriterion("id =", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotEqualTo(Long value) {
			addCriterion("id <>", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThan(Long value) {
			addCriterion("id >", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThanOrEqualTo(Long value) {
			addCriterion("id >=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThan(Long value) {
			addCriterion("id <", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThanOrEqualTo(Long value) {
			addCriterion("id <=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdIn(List<Long> values) {
			addCriterion("id in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotIn(List<Long> values) {
			addCriterion("id not in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdBetween(Long value1, Long value2) {
			addCriterion("id between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotBetween(Long value1, Long value2) {
			addCriterion("id not between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andTypeNameIsNull() {
			addCriterion("type_name is null");
			return (Criteria) this;
		}

		public Criteria andTypeNameIsNotNull() {
			addCriterion("type_name is not null");
			return (Criteria) this;
		}

		public Criteria andTypeNameEqualTo(String value) {
			addCriterion("type_name =", value, "typeName");
			return (Criteria) this;
		}

		public Criteria andTypeNameNotEqualTo(String value) {
			addCriterion("type_name <>", value, "typeName");
			return (Criteria) this;
		}

		public Criteria andTypeNameGreaterThan(String value) {
			addCriterion("type_name >", value, "typeName");
			return (Criteria) this;
		}

		public Criteria andTypeNameGreaterThanOrEqualTo(String value) {
			addCriterion("type_name >=", value, "typeName");
			return (Criteria) this;
		}

		public Criteria andTypeNameLessThan(String value) {
			addCriterion("type_name <", value, "typeName");
			return (Criteria) this;
		}

		public Criteria andTypeNameLessThanOrEqualTo(String value) {
			addCriterion("type_name <=", value, "typeName");
			return (Criteria) this;
		}

		public Criteria andTypeNameLike(String value) {
			addCriterion("type_name like", value, "typeName");
			return (Criteria) this;
		}

		public Criteria andTypeNameNotLike(String value) {
			addCriterion("type_name not like", value, "typeName");
			return (Criteria) this;
		}

		public Criteria andTypeNameIn(List<String> values) {
			addCriterion("type_name in", values, "typeName");
			return (Criteria) this;
		}

		public Criteria andTypeNameNotIn(List<String> values) {
			addCriterion("type_name not in", values, "typeName");
			return (Criteria) this;
		}

		public Criteria andTypeNameBetween(String value1, String value2) {
			addCriterion("type_name between", value1, value2, "typeName");
			return (Criteria) this;
		}

		public Criteria andTypeNameNotBetween(String value1, String value2) {
			addCriterion("type_name not between", value1, value2, "typeName");
			return (Criteria) this;
		}

		public Criteria andFileExtIsNull() {
			addCriterion("file_ext is null");
			return (Criteria) this;
		}

		public Criteria andFileExtIsNotNull() {
			addCriterion("file_ext is not null");
			return (Criteria) this;
		}

		public Criteria andFileExtEqualTo(String value) {
			addCriterion("file_ext =", value, "fileExt");
			return (Criteria) this;
		}

		public Criteria andFileExtNotEqualTo(String value) {
			addCriterion("file_ext <>", value, "fileExt");
			return (Criteria) this;
		}

		public Criteria andFileExtGreaterThan(String value) {
			addCriterion("file_ext >", value, "fileExt");
			return (Criteria) this;
		}

		public Criteria andFileExtGreaterThanOrEqualTo(String value) {
			addCriterion("file_ext >=", value, "fileExt");
			return (Criteria) this;
		}

		public Criteria andFileExtLessThan(String value) {
			addCriterion("file_ext <", value, "fileExt");
			return (Criteria) this;
		}

		public Criteria andFileExtLessThanOrEqualTo(String value) {
			addCriterion("file_ext <=", value, "fileExt");
			return (Criteria) this;
		}

		public Criteria andFileExtLike(String value) {
			addCriterion("file_ext like", value, "fileExt");
			return (Criteria) this;
		}

		public Criteria andFileExtNotLike(String value) {
			addCriterion("file_ext not like", value, "fileExt");
			return (Criteria) this;
		}

		public Criteria andFileExtIn(List<String> values) {
			addCriterion("file_ext in", values, "fileExt");
			return (Criteria) this;
		}

		public Criteria andFileExtNotIn(List<String> values) {
			addCriterion("file_ext not in", values, "fileExt");
			return (Criteria) this;
		}

		public Criteria andFileExtBetween(String value1, String value2) {
			addCriterion("file_ext between", value1, value2, "fileExt");
			return (Criteria) this;
		}

		public Criteria andFileExtNotBetween(String value1, String value2) {
			addCriterion("file_ext not between", value1, value2, "fileExt");
			return (Criteria) this;
		}

		public Criteria andContentTypeIsNull() {
			addCriterion("content_type is null");
			return (Criteria) this;
		}

		public Criteria andContentTypeIsNotNull() {
			addCriterion("content_type is not null");
			return (Criteria) this;
		}

		public Criteria andContentTypeEqualTo(String value) {
			addCriterion("content_type =", value, "contentType");
			return (Criteria) this;
		}

		public Criteria andContentTypeNotEqualTo(String value) {
			addCriterion("content_type <>", value, "contentType");
			return (Criteria) this;
		}

		public Criteria andContentTypeGreaterThan(String value) {
			addCriterion("content_type >", value, "contentType");
			return (Criteria) this;
		}

		public Criteria andContentTypeGreaterThanOrEqualTo(String value) {
			addCriterion("content_type >=", value, "contentType");
			return (Criteria) this;
		}

		public Criteria andContentTypeLessThan(String value) {
			addCriterion("content_type <", value, "contentType");
			return (Criteria) this;
		}

		public Criteria andContentTypeLessThanOrEqualTo(String value) {
			addCriterion("content_type <=", value, "contentType");
			return (Criteria) this;
		}

		public Criteria andContentTypeLike(String value) {
			addCriterion("content_type like", value, "contentType");
			return (Criteria) this;
		}

		public Criteria andContentTypeNotLike(String value) {
			addCriterion("content_type not like", value, "contentType");
			return (Criteria) this;
		}

		public Criteria andContentTypeIn(List<String> values) {
			addCriterion("content_type in", values, "contentType");
			return (Criteria) this;
		}

		public Criteria andContentTypeNotIn(List<String> values) {
			addCriterion("content_type not in", values, "contentType");
			return (Criteria) this;
		}

		public Criteria andContentTypeBetween(String value1, String value2) {
			addCriterion("content_type between", value1, value2, "contentType");
			return (Criteria) this;
		}

		public Criteria andContentTypeNotBetween(String value1, String value2) {
			addCriterion("content_type not between", value1, value2, "contentType");
			return (Criteria) this;
		}

		public Criteria andMaxUploadSizeIsNull() {
			addCriterion("max_upload_size is null");
			return (Criteria) this;
		}

		public Criteria andMaxUploadSizeIsNotNull() {
			addCriterion("max_upload_size is not null");
			return (Criteria) this;
		}

		public Criteria andMaxUploadSizeEqualTo(Integer value) {
			addCriterion("max_upload_size =", value, "maxUploadSize");
			return (Criteria) this;
		}

		public Criteria andMaxUploadSizeNotEqualTo(Integer value) {
			addCriterion("max_upload_size <>", value, "maxUploadSize");
			return (Criteria) this;
		}

		public Criteria andMaxUploadSizeGreaterThan(Integer value) {
			addCriterion("max_upload_size >", value, "maxUploadSize");
			return (Criteria) this;
		}

		public Criteria andMaxUploadSizeGreaterThanOrEqualTo(Integer value) {
			addCriterion("max_upload_size >=", value, "maxUploadSize");
			return (Criteria) this;
		}

		public Criteria andMaxUploadSizeLessThan(Integer value) {
			addCriterion("max_upload_size <", value, "maxUploadSize");
			return (Criteria) this;
		}

		public Criteria andMaxUploadSizeLessThanOrEqualTo(Integer value) {
			addCriterion("max_upload_size <=", value, "maxUploadSize");
			return (Criteria) this;
		}

		public Criteria andMaxUploadSizeIn(List<Integer> values) {
			addCriterion("max_upload_size in", values, "maxUploadSize");
			return (Criteria) this;
		}

		public Criteria andMaxUploadSizeNotIn(List<Integer> values) {
			addCriterion("max_upload_size not in", values, "maxUploadSize");
			return (Criteria) this;
		}

		public Criteria andMaxUploadSizeBetween(Integer value1, Integer value2) {
			addCriterion("max_upload_size between", value1, value2, "maxUploadSize");
			return (Criteria) this;
		}

		public Criteria andMaxUploadSizeNotBetween(Integer value1, Integer value2) {
			addCriterion("max_upload_size not between", value1, value2, "maxUploadSize");
			return (Criteria) this;
		}

		public Criteria andMaxDownloadSizeIsNull() {
			addCriterion("max_download_size is null");
			return (Criteria) this;
		}

		public Criteria andMaxDownloadSizeIsNotNull() {
			addCriterion("max_download_size is not null");
			return (Criteria) this;
		}

		public Criteria andMaxDownloadSizeEqualTo(Integer value) {
			addCriterion("max_download_size =", value, "maxDownloadSize");
			return (Criteria) this;
		}

		public Criteria andMaxDownloadSizeNotEqualTo(Integer value) {
			addCriterion("max_download_size <>", value, "maxDownloadSize");
			return (Criteria) this;
		}

		public Criteria andMaxDownloadSizeGreaterThan(Integer value) {
			addCriterion("max_download_size >", value, "maxDownloadSize");
			return (Criteria) this;
		}

		public Criteria andMaxDownloadSizeGreaterThanOrEqualTo(Integer value) {
			addCriterion("max_download_size >=", value, "maxDownloadSize");
			return (Criteria) this;
		}

		public Criteria andMaxDownloadSizeLessThan(Integer value) {
			addCriterion("max_download_size <", value, "maxDownloadSize");
			return (Criteria) this;
		}

		public Criteria andMaxDownloadSizeLessThanOrEqualTo(Integer value) {
			addCriterion("max_download_size <=", value, "maxDownloadSize");
			return (Criteria) this;
		}

		public Criteria andMaxDownloadSizeIn(List<Integer> values) {
			addCriterion("max_download_size in", values, "maxDownloadSize");
			return (Criteria) this;
		}

		public Criteria andMaxDownloadSizeNotIn(List<Integer> values) {
			addCriterion("max_download_size not in", values, "maxDownloadSize");
			return (Criteria) this;
		}

		public Criteria andMaxDownloadSizeBetween(Integer value1, Integer value2) {
			addCriterion("max_download_size between", value1, value2, "maxDownloadSize");
			return (Criteria) this;
		}

		public Criteria andMaxDownloadSizeNotBetween(Integer value1, Integer value2) {
			addCriterion("max_download_size not between", value1, value2, "maxDownloadSize");
			return (Criteria) this;
		}

		public Criteria andValidIsNull() {
			addCriterion("valid is null");
			return (Criteria) this;
		}

		public Criteria andValidIsNotNull() {
			addCriterion("valid is not null");
			return (Criteria) this;
		}

		public Criteria andValidEqualTo(String value) {
			addCriterion("valid =", value, "valid");
			return (Criteria) this;
		}

		public Criteria andValidNotEqualTo(String value) {
			addCriterion("valid <>", value, "valid");
			return (Criteria) this;
		}

		public Criteria andValidGreaterThan(String value) {
			addCriterion("valid >", value, "valid");
			return (Criteria) this;
		}

		public Criteria andValidGreaterThanOrEqualTo(String value) {
			addCriterion("valid >=", value, "valid");
			return (Criteria) this;
		}

		public Criteria andValidLessThan(String value) {
			addCriterion("valid <", value, "valid");
			return (Criteria) this;
		}

		public Criteria andValidLessThanOrEqualTo(String value) {
			addCriterion("valid <=", value, "valid");
			return (Criteria) this;
		}

		public Criteria andValidLike(String value) {
			addCriterion("valid like", value, "valid");
			return (Criteria) this;
		}

		public Criteria andValidNotLike(String value) {
			addCriterion("valid not like", value, "valid");
			return (Criteria) this;
		}

		public Criteria andValidIn(List<String> values) {
			addCriterion("valid in", values, "valid");
			return (Criteria) this;
		}

		public Criteria andValidNotIn(List<String> values) {
			addCriterion("valid not in", values, "valid");
			return (Criteria) this;
		}

		public Criteria andValidBetween(String value1, String value2) {
			addCriterion("valid between", value1, value2, "valid");
			return (Criteria) this;
		}

		public Criteria andValidNotBetween(String value1, String value2) {
			addCriterion("valid not between", value1, value2, "valid");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table fm_file_type
	 * @mbg.generated  Thu Dec 20 16:13:57 CST 2018
	 */
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

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table fm_file_type
     *
     * @mbg.generated do_not_delete_during_merge Sun Dec 02 21:55:10 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}