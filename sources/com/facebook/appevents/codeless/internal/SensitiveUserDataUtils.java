package com.facebook.appevents.codeless.internal;

import android.text.method.PasswordTransformationMethod;
import android.util.Patterns;
import android.view.View;
import android.widget.TextView;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import v7.a;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0012\u0010\f\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\rH\u0007¨\u0006\u000e"}, d2 = {"Lcom/facebook/appevents/codeless/internal/SensitiveUserDataUtils;", "", "()V", "isCreditCard", "", "view", "Landroid/widget/TextView;", "isEmail", "isPassword", "isPersonName", "isPhoneNumber", "isPostalAddress", "isSensitiveUserData", "Landroid/view/View;", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class SensitiveUserDataUtils {
    public static final SensitiveUserDataUtils INSTANCE = new SensitiveUserDataUtils();

    private SensitiveUserDataUtils() {
    }

    private final boolean isCreditCard(TextView view) {
        if (a.b(this)) {
            return false;
        }
        try {
            String input = ViewHierarchy.getTextOfView(view);
            Pattern patternCompile = Pattern.compile("\\s");
            n.e(patternCompile, "compile(...)");
            n.f(input, "input");
            String strReplaceAll = patternCompile.matcher(input).replaceAll("");
            n.e(strReplaceAll, "replaceAll(...)");
            int length = strReplaceAll.length();
            if (length >= 12 && length <= 19) {
                int i10 = 0;
                boolean z10 = false;
                for (int i11 = length - 1; -1 < i11; i11--) {
                    char cCharAt = strReplaceAll.charAt(i11);
                    if (!Character.isDigit(cCharAt)) {
                        return false;
                    }
                    int iDigit = Character.digit((int) cCharAt, 10);
                    if (iDigit < 0) {
                        throw new IllegalArgumentException("Char " + cCharAt + " is not a decimal digit");
                    }
                    if (z10 && (iDigit = iDigit * 2) > 9) {
                        iDigit = (iDigit % 10) + 1;
                    }
                    i10 += iDigit;
                    z10 = !z10;
                }
                if (i10 % 10 == 0) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th2) {
            a.a(this, th2);
            return false;
        }
    }

    private final boolean isEmail(TextView view) {
        if (a.b(this)) {
            return false;
        }
        try {
            if (view.getInputType() == 32) {
                return true;
            }
            String textOfView = ViewHierarchy.getTextOfView(view);
            if (textOfView != null && textOfView.length() != 0) {
                return Patterns.EMAIL_ADDRESS.matcher(textOfView).matches();
            }
            return false;
        } catch (Throwable th2) {
            a.a(this, th2);
            return false;
        }
    }

    private final boolean isPassword(TextView view) {
        if (a.b(this)) {
            return false;
        }
        try {
            if (view.getInputType() == 128) {
                return true;
            }
            return view.getTransformationMethod() instanceof PasswordTransformationMethod;
        } catch (Throwable th2) {
            a.a(this, th2);
            return false;
        }
    }

    private final boolean isPersonName(TextView view) {
        if (a.b(this)) {
            return false;
        }
        try {
            return view.getInputType() == 96;
        } catch (Throwable th2) {
            a.a(this, th2);
            return false;
        }
    }

    private final boolean isPhoneNumber(TextView view) {
        if (a.b(this)) {
            return false;
        }
        try {
            return view.getInputType() == 3;
        } catch (Throwable th2) {
            a.a(this, th2);
            return false;
        }
    }

    private final boolean isPostalAddress(TextView view) {
        if (a.b(this)) {
            return false;
        }
        try {
            return view.getInputType() == 112;
        } catch (Throwable th2) {
            a.a(this, th2);
            return false;
        }
    }

    public static final boolean isSensitiveUserData(View view) {
        if (a.b(SensitiveUserDataUtils.class)) {
            return false;
        }
        try {
            if (!(view instanceof TextView)) {
                return false;
            }
            SensitiveUserDataUtils sensitiveUserDataUtils = INSTANCE;
            return sensitiveUserDataUtils.isPassword((TextView) view) || sensitiveUserDataUtils.isCreditCard((TextView) view) || sensitiveUserDataUtils.isPersonName((TextView) view) || sensitiveUserDataUtils.isPostalAddress((TextView) view) || sensitiveUserDataUtils.isPhoneNumber((TextView) view) || sensitiveUserDataUtils.isEmail((TextView) view);
        } catch (Throwable th2) {
            a.a(SensitiveUserDataUtils.class, th2);
            return false;
        }
    }
}
