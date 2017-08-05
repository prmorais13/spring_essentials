package br.com.paulo.spring_essentials.error;

import java.util.Date;

public class ResourceNotFoundDetails extends ErrorDetail {

    public static final class builder {
        private String title;
        private int status;
        private String detail;
        private Date date;
        private String developerMessage;

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

        public ResourceNotFoundDetails build() {
            ResourceNotFoundDetails resourceNotFoundDetails = new ResourceNotFoundDetails();
            resourceNotFoundDetails.setDetail(detail);
            resourceNotFoundDetails.setStatus(status);
            resourceNotFoundDetails.setDate(new Date());
            resourceNotFoundDetails.setDeveloperMessage(developerMessage);
            resourceNotFoundDetails.setTitle(title);
            return resourceNotFoundDetails;
        }
    }
}
