package sealless;

import androidx.compose.ui.autofill.AutofillType;
import com.applovin.sdk.AppLovinEventParameters;
import java.util.HashMap;
import p002kotlin.Metadata;
import p002kotlin.collections.seminary;

/* JADX INFO: compiled from: AndroidAutofillType.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\n\"6\u0010\b\u001a\u001e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000j\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002`\u00038\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u0012\u0004\b\u0006\u0010\u0007\"\u001e\u0010\f\u001a\u00020\u0002*\u00020\u00018@X\u0081\u0004¢\u0006\f\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\u0004\u0010\t¨\u0006\r"}, d2 = {"Ljava/util/HashMap;", "Landroidx/compose/ui/autofill/AutofillType;", "", "Lkotlin/collections/HashMap;", "attabal", "Ljava/util/HashMap;", "getAndroidAutofillTypes$annotations", "()V", "androidAutofillTypes", "(Landroidx/compose/ui/autofill/AutofillType;)Ljava/lang/String;", "getAndroidType$annotations", "(Landroidx/compose/ui/autofill/AutofillType;)V", "androidType", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class marial {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final HashMap<AutofillType, String> f37444attabal = seminary.apical(patroclinal.formularize.attabal(AutofillType.EmailAddress, "emailAddress"), patroclinal.formularize.attabal(AutofillType.Username, AppLovinEventParameters.USER_ACCOUNT_IDENTIFIER), patroclinal.formularize.attabal(AutofillType.Password, "password"), patroclinal.formularize.attabal(AutofillType.NewUsername, "newUsername"), patroclinal.formularize.attabal(AutofillType.NewPassword, "newPassword"), patroclinal.formularize.attabal(AutofillType.PostalAddress, "postalAddress"), patroclinal.formularize.attabal(AutofillType.PostalCode, "postalCode"), patroclinal.formularize.attabal(AutofillType.CreditCardNumber, "creditCardNumber"), patroclinal.formularize.attabal(AutofillType.CreditCardSecurityCode, "creditCardSecurityCode"), patroclinal.formularize.attabal(AutofillType.CreditCardExpirationDate, "creditCardExpirationDate"), patroclinal.formularize.attabal(AutofillType.CreditCardExpirationMonth, "creditCardExpirationMonth"), patroclinal.formularize.attabal(AutofillType.CreditCardExpirationYear, "creditCardExpirationYear"), patroclinal.formularize.attabal(AutofillType.CreditCardExpirationDay, "creditCardExpirationDay"), patroclinal.formularize.attabal(AutofillType.AddressCountry, "addressCountry"), patroclinal.formularize.attabal(AutofillType.AddressRegion, "addressRegion"), patroclinal.formularize.attabal(AutofillType.AddressLocality, "addressLocality"), patroclinal.formularize.attabal(AutofillType.AddressStreet, "streetAddress"), patroclinal.formularize.attabal(AutofillType.AddressAuxiliaryDetails, "extendedAddress"), patroclinal.formularize.attabal(AutofillType.PostalCodeExtended, "extendedPostalCode"), patroclinal.formularize.attabal(AutofillType.PersonFullName, "personName"), patroclinal.formularize.attabal(AutofillType.PersonFirstName, "personGivenName"), patroclinal.formularize.attabal(AutofillType.PersonLastName, "personFamilyName"), patroclinal.formularize.attabal(AutofillType.PersonMiddleName, "personMiddleName"), patroclinal.formularize.attabal(AutofillType.PersonMiddleInitial, "personMiddleInitial"), patroclinal.formularize.attabal(AutofillType.PersonNamePrefix, "personNamePrefix"), patroclinal.formularize.attabal(AutofillType.PersonNameSuffix, "personNameSuffix"), patroclinal.formularize.attabal(AutofillType.PhoneNumber, "phoneNumber"), patroclinal.formularize.attabal(AutofillType.PhoneNumberDevice, "phoneNumberDevice"), patroclinal.formularize.attabal(AutofillType.PhoneCountryCode, "phoneCountryCode"), patroclinal.formularize.attabal(AutofillType.PhoneNumberNational, "phoneNational"), patroclinal.formularize.attabal(AutofillType.Gender, "gender"), patroclinal.formularize.attabal(AutofillType.BirthDateFull, "birthDateFull"), patroclinal.formularize.attabal(AutofillType.BirthDateDay, "birthDateDay"), patroclinal.formularize.attabal(AutofillType.BirthDateMonth, "birthDateMonth"), patroclinal.formularize.attabal(AutofillType.BirthDateYear, "birthDateYear"), patroclinal.formularize.attabal(AutofillType.SmsOtpCode, "smsOTPCode"));

    public static final String attabal(AutofillType autofillType) {
        String str = f37444attabal.get(autofillType);
        if (str != null) {
            return str;
        }
        throw new IllegalArgumentException("Unsupported autofill type");
    }
}
