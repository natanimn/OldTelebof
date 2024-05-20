package et.telebof.requests;

import et.telebof.types.LabeledPrice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class CreateInvoiceLink extends AbstractBaseRequest<CreateInvoiceLink, String> {
    public CreateInvoiceLink(Object chatId, String title, String description, String payload, String providerToken,
                             String currency, LabeledPrice[] prices, RequestSender requestSender) {
        super(chatId, requestSender, "createInvoiceLink");
        add("title", title);
        add("description", description);
        add("payload", payload);
        add("provider_token", providerToken);
        add("currency", currency);
        add("prices", List.of(prices));
    }

    public CreateInvoiceLink maxTipAmount(int maxTipAmount) {
        return add("max_tip_amount", maxTipAmount);
    }

    public CreateInvoiceLink suggestedTipAmounts(int[] suggestedTipAmounts) {
        return add("suggested_tip_amounts", List.of(suggestedTipAmounts));
    }

    public CreateInvoiceLink providerData(String providerData) {
        return add("provider_data", providerData);
    }

    public CreateInvoiceLink photoUrl(String photoUrl) {
        return add("photo_url", photoUrl);
    }

    public CreateInvoiceLink photoSize(int photoSize) {
        return add("photo_size", photoSize);
    }

    public CreateInvoiceLink photoWidth(int photoWidth) {
        return add("photo_width", photoWidth);
    }

    public CreateInvoiceLink photoHeight(int photoHeight) {
        return add("photo_height", photoHeight);
    }

    public CreateInvoiceLink needName(boolean needName) {
        return add("need_name", needName);
    }

    public CreateInvoiceLink needPhoneNumber(boolean needPhoneNumber) {
        return add("need_phone_number", needPhoneNumber);
    }

    public CreateInvoiceLink needEmail(boolean needEmail) {
        return add("need_email", needEmail);
    }

    public CreateInvoiceLink needShippingAddress(boolean needShippingAddress) {
        return add("need_shipping_address", needShippingAddress);
    }

    public CreateInvoiceLink sendPhoneNumberToProvider(boolean sendPhoneNumberToProvider) {
        return add("send_phone_number_to_provider", sendPhoneNumberToProvider);
    }

    public CreateInvoiceLink sendEmailToProvider(boolean sendEmailToProvider) {
        return add("send_email_to_provider", sendEmailToProvider);
    }

    public CreateInvoiceLink isFlexible(boolean isFlexible) {
        return add("is_flexible", isFlexible);
    }

    @Override
    public String bind() {
        return (String) requestSender.makeRequest(this);
    }
}
