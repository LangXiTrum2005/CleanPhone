package com.facebook;

import com.facebook.internal.FeatureManager;
import com.facebook.internal.instrument.InstrumentUtility;
import com.facebook.internal.instrument.errorreport.ErrorReportData;
import java.util.Arrays;
import java.util.Random;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/facebook/FacebookException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "Companion", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public class FacebookException extends RuntimeException {
    public static final long serialVersionUID = 1;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/facebook/FacebookException$Companion;", "", "", "serialVersionUID", "J", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
    }

    public FacebookException(final String str) {
        super(str);
        Random random = new Random();
        if (str == null || !FacebookSdk.f15923p.get() || random.nextInt(100) <= 50) {
            return;
        }
        FeatureManager.a(new FeatureManager.Callback() { // from class: com.facebook.FacebookException.1
            @Override // com.facebook.internal.FeatureManager.Callback
            public final void a(boolean z2) {
                if (z2) {
                    try {
                        ErrorReportData errorReportData = new ErrorReportData(str);
                        if ((errorReportData.f16436b == null || errorReportData.f16437c == null) ? false : true) {
                            InstrumentUtility.h(errorReportData.f16435a, errorReportData.toString());
                        }
                    } catch (Exception unused) {
                    }
                }
            }
        }, FeatureManager.Feature.ErrorReport);
    }

    @Override // java.lang.Throwable
    public String toString() {
        String message = getMessage();
        return message != null ? message : "";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FacebookException(String str, Object... objArr) {
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        this(String.format(str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length)));
    }
}
