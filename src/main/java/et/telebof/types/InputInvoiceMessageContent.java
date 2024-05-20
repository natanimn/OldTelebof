package et.telebof.types;

import java.io.Serializable;
import java.util.List;


public class InputInvoiceMessageContent implements Serializable {
    private String title, description, payload, provider_token, currency, provider_data, photo_url;
    private List<LabeledPrice> prices;
    private List<Integer> suggested_tip_amount;
    private Integer max_tip_amount, photo_width, photo_height, photo_size;
    private Boolean need_name, need_phone_number;


    public InputInvoiceMessageContent title(String title) {
        this.title = title;
        return  this;
    }

    public InputInvoiceMessageContent payload(String payload) {
        this.payload = payload;
        return  this;
    }

    public InputInvoiceMessageContent currency(String currency) {
        this.currency = currency;
        return this;
    }

    public InputInvoiceMessageContent prices(LabeledPrice[] prices) {
        this.prices = List.of(prices);
        return this;
    }

    public InputInvoiceMessageContent maxTipAmount(int maxTipAmount) {
        this.max_tip_amount = maxTipAmount;
        return this;
    }

    public InputInvoiceMessageContent suggestedTipAmounts(Integer[] suggestedTipAmounts) {
        this.suggested_tip_amount = List.of(suggestedTipAmounts);
        return this;
    }

    public InputInvoiceMessageContent providerData(String providerData) {
        this.provider_data = providerData;
        return this;
    }

    public InputInvoiceMessageContent photoUrl(String photoUrl) {
        this.photo_url = photoUrl;
        return this;
    }

    public InputInvoiceMessageContent photoSize(int photoSize) {
        this.photo_size = photoSize;
        return this;
    }

    public InputInvoiceMessageContent photoWidth(int photoWidth) {
        this.photo_width = photoWidth;
        return this;
    }

    public InputInvoiceMessageContent photoHeight(int photoHeight) {
        this.photo_height = photoHeight;
        return this;
    }

    public InputInvoiceMessageContent needName(Boolean needName) {
        this.need_name = needName;
        return this;
    }

    public InputInvoiceMessageContent needPhoneNumber(Boolean needPhoneNumber) {
        this.need_phone_number = needPhoneNumber;
        return this;
    }

    public InputInvoiceMessageContent needEmail(Boolean needEmail) {
        return this;
    }

    public InputInvoiceMessageContent needShippingAddress(Boolean needShippingAddress) {
        return this;
    }

    public InputInvoiceMessageContent sendPhoneNumberToProvider(Boolean sendPhoneNumberToProvider) {
        return this;
    }

    public InputInvoiceMessageContent sendEmailToProvider(Boolean sendEmailToProvider) {
        return this;
    }

    public InputInvoiceMessageContent isFlexible(Boolean isFlexible) {
        return this;
    }

}
