package br.com.paulo.spring_essentials.error;

import java.util.Date;

public class ResourceNotFoundDetails {
    private String title;
    private int status;
    private String detail;
    private Date date;
    private String developerMessage;

    private ResourceNotFoundDetails() {

    }

    public String getTitle() {
        return title;
    }

    public int getStatus() {
        return status;
    }

    public String getDetail() {
        return detail;
    }

    public Date getDate() {
        return date;
    }

    public String getDeveloperMessage() {
        return developerMessage;
    }

    public static final class ResourceNotFoundDetailsBuilder {
        private String title;
        private int status;
        private String detail;
        private Date date;
        private String developerMessage;

        private ResourceNotFoundDetailsBuilder() {
        }

        public static ResourceNotFoundDetailsBuilder newBuilder() {
            return new ResourceNotFoundDetailsBuilder();
        }

        public ResourceNotFoundDetailsBuilder title(String title) {
            this.title = title;
            return this;
        }

        public ResourceNotFoundDetailsBuilder status(int status) {
            this.status = status;
            return this;
        }

        public ResourceNotFoundDetailsBuilder detail(String detail) {
            this.detail = detail;
            return this;
        }

        public ResourceNotFoundDetailsBuilder date(Date date) {
            this.date = date;
            return this;
        }

        public ResourceNotFoundDetailsBuilder developerMessage(String developerMessage) {
            this.developerMessage = developerMessage;
            return this;
        }

        public ResourceNotFoundDetails build() {
            ResourceNotFoundDetails resourceNotFoundDetails = new ResourceNotFoundDetails();
            resourceNotFoundDetails.detail = this.detail;
            resourceNotFoundDetails.status = this.status;
            resourceNotFoundDetails.date = this.date;
            resourceNotFoundDetails.developerMessage = this.developerMessage;
            resourceNotFoundDetails.title = this.title;
            return resourceNotFoundDetails;
        }
    }
}
