package com.supportportal.constant;

public class EmailConstant {
    public static final String SIMPLE_MAIL_TRANSFER_PROTOCOL = "smtps";
    public static final String USERNAME = "Email test";
    public static final String PASSWORD = "Test2000@";
    public static final String FROM_EMAIL = "testemail23033@gmail.com";
    public static final String CC_EMAIL = "";
    public static final String EMAIL_SUBJECT = "Get Arrays, LLC - New Password";
    public static final String GMAIL_SMTP_SERVER = "smtp.gmail.com";
    public static final String SMTP_HOST = "mail.smtp.host";
    public static final String SMTP_AUTH = "mail.smtp.auth";
    public static final String SMTP_PORT = "mail.smtp.port";
    public static final int DEFAULT_PORT = 465;
    public static final String SMTP_STARTTLS_ENABLE = "mail.smtp.starttls.enable";
    public static final String SMTP_STARTTLS_REQUIRED = "mail.smtp.starttls.required";
    public static  final String RESET_PASSWORD_TEMPLATE =
            "Hi ${name},\n\n" +
            "This email is to inform you about a recent change to your account password.\n\n" +
            "Password Change Date: ${changeDate}\n" +
            "Your new password : ${password}\n\n" +
            "If you made this change, you can ignore this email.\n\n" +
            "If you did not change your password, please contact Support: If you did not request this change and believe" +
                    " your account may be compromised, please contact our support team at ${supportEmail} or ${supportPhoneNumber} immediately.\n\n" +
            "Thank you for using our services.\n\n" +
            "Sincerely,\n" +
            "${companyName}\n";
    public static final String REGISTER_TEMPLATE =
            "Hi ${name},\n\n" +
            "Welcome to our website! I'm so thrilled to have you as a new member of our community.\n\n" +
            "Your login credentials are as follows:\n" +
            "Username: ${username}\n" +
            "Password: ${initialPassword}\n\n" +
            "Please log in using your credentials and feel free to explore our website.\n\n" +
            "If you have any questions or need assistance, don't hesitate to contact us at ${supportEmail} or ${supportPhoneNumber}.\n\n" +
            "Thank you for choosing our website. We look forward to serving you!\n\n" +
            "Sincerely,\n" +
            "${companyName}\n";
}
