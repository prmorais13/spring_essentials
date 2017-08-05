package br.com.paulo.spring_essentials.error;

import java.util.Date;

public class ValidationErrorDetail extends ErrorDetail {

    private String field;
    private String fieldMessage;

    public static final class builder {
        private String title;
        private int status;
        private String detail;
        private Date date;
        private String developerMessage;
        private String field;
        private String fieldMessage;

        private builder() {
        }

        public static builder newBuilder() {
            return new builder();
        }

        public builder title(String title) {
            this.title = title;
            return this;
        }

        public builder status(int status) {
            this.status = status;
            return this;
        }

        public builder detail(String detail) {
            this.detail = detail;
            return this;
        }

        public builder date(Date date) {
            this.date = date;
            return this;
        }

        public builder developerMessage(String developerMessage) {
            this.developerMessage = developerMessage;
            return this;
        }

        public builder field(String field) {
            this.field = field;
            return this;
        }

        public builder fieldMessage(String fieldMessage) {
            this.fieldMessage = fieldMessage;
            return this;
        }

        public ValidationErrorDetail build() {
            ValidationErrorDetail validationErrorDetail = new ValidationErrorDetail();
            validationErrorDetail.setDetail(detail);
            validationErrorDetail.setStatus(status);
            validationErrorDetail.setDate(new Date());
            validationErrorDetail.setDeveloperMessage(developerMessage);
            validationErrorDetail.setTitle(title);
            return validationErrorDetail;
        }

        public String getFieldMessage() {
            return fieldMessage;
        }

        public void setFieldMessage(String fieldMessage) {
            this.fieldMessage = fieldMessage;
        }
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getFieldMessage() {
        return fieldMessage;
    }

    public void setFieldMessage(String fieldMessage) {
        this.fieldMessage = fieldMessage;
    }
}
