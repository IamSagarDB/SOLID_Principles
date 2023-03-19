package OODesign.Creational.Builder;

public class URLBuilder {
    public static class Builder {
        private String hostName;
        private String portNumber;
        private String protocol;
        private String path;
        private String queryParameter;

        public Builder protocol(String protocol) {
            this.protocol = protocol;
            return this;
        }

        public Builder hostName(String hostName) {
            this.hostName = hostName;
            return this;
        }

        public Builder portNumber(String portNumber) {
            this.portNumber = portNumber;
            return this;
        }

        public Builder path(String path) {
            this.path = path;
            return this;
        }

        public Builder queryParameter(String queryParameter) {
            this.queryParameter = queryParameter;
            return this;
        }

        public URLBuilder build() {
            return new URLBuilder(this);
        }
    }

    public static String hostName;
    public static String portNumber;
    public static String protocol;
    public static String path;
    public static String queryParameter;

    private URLBuilder(Builder builder) {
        this.protocol = builder.protocol;
        this.hostName = builder.hostName;
        this.portNumber = builder.portNumber;
        this.path = builder.path;
        this.queryParameter = builder.queryParameter;
    }

}
