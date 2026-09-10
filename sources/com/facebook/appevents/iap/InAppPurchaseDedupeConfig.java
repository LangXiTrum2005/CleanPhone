package com.facebook.appevents.iap;

import android.os.Bundle;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.appevents.OperationalData;
import com.facebook.appevents.OperationalDataEnum;
import com.facebook.appevents.internal.Constants;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import j1.f;
import java.util.ArrayList;
import java.util.Currency;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import l7.s;
import q7.r;
import q7.u;
import xj.o;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\t\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00060\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ/\u0010\u000b\u001a\u001c\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00060\u0007\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\nJ\u0013\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\u000e\u0010\rJ\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0016\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ;\u0010\u001f\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u000f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u000f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\"R\u0014\u0010$\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R,\u0010&\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00060\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\"¨\u0006'"}, d2 = {"Lcom/facebook/appevents/iap/InAppPurchaseDedupeConfig;", "", "<init>", "()V", "", "dedupingWithImplicitlyLoggedHistory", "", "Lwj/f;", "", "getDedupeParameters", "(Z)Ljava/util/List;", "getTestDedupeParameters", "getCurrencyParameterEquivalents", "()Ljava/util/List;", "getValueParameterEquivalents", "Landroid/os/Bundle;", "parameters", "Ljava/util/Currency;", "getCurrencyOfManualEvent", "(Landroid/os/Bundle;)Ljava/util/Currency;", "", "valueToSum", "getValueOfManualEvent", "(Ljava/lang/Double;Landroid/os/Bundle;)Ljava/lang/Double;", "", "getDedupeWindow", "()J", "dedupeParameters", "originalParameters", "Lcom/facebook/appevents/OperationalData;", "originalOperationalData", "addDedupeParameters", "(Landroid/os/Bundle;Landroid/os/Bundle;Lcom/facebook/appevents/OperationalData;)Lwj/f;", "defaultCurrencyParameterEquivalents", "Ljava/util/List;", "defaultValueParameterEquivalents", "defaultDedupeWindow", "J", "defaultDedupeParameters", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class InAppPurchaseDedupeConfig {
    public static final InAppPurchaseDedupeConfig INSTANCE = new InAppPurchaseDedupeConfig();
    private static final List<String> defaultCurrencyParameterEquivalents = f.C(AppEventsConstants.EVENT_PARAM_CURRENCY);
    private static final List<String> defaultValueParameterEquivalents = f.C(AppEventsConstants.EVENT_PARAM_VALUE_TO_SUM);
    private static final long defaultDedupeWindow = TimeUnit.MINUTES.toMillis(1);
    private static final List<wj.f> defaultDedupeParameters = o.Q(new wj.f(Constants.IAP_PRODUCT_ID, f.C(Constants.IAP_PRODUCT_ID)), new wj.f(Constants.IAP_PRODUCT_DESCRIPTION, f.C(Constants.IAP_PRODUCT_DESCRIPTION)), new wj.f(Constants.IAP_PRODUCT_TITLE, f.C(Constants.IAP_PRODUCT_TITLE)), new wj.f(Constants.IAP_PURCHASE_TOKEN, f.C(Constants.IAP_PURCHASE_TOKEN)));

    private InAppPurchaseDedupeConfig() {
    }

    public final wj.f addDedupeParameters(Bundle dedupeParameters, Bundle originalParameters, OperationalData originalOperationalData) {
        Bundle bundle;
        OperationalData operationalData;
        if (dedupeParameters == null) {
            return new wj.f(originalParameters, originalOperationalData);
        }
        try {
            bundle = originalParameters;
            operationalData = originalOperationalData;
            for (String key : dedupeParameters.keySet()) {
                try {
                    String string = dedupeParameters.getString(key);
                    if (string != null) {
                        OperationalData.Companion companion = OperationalData.INSTANCE;
                        OperationalDataEnum operationalDataEnum = OperationalDataEnum.IAPParameters;
                        n.e(key, "key");
                        wj.f fVarAddParameterAndReturn = companion.addParameterAndReturn(operationalDataEnum, key, string, bundle, operationalData);
                        Bundle bundle2 = (Bundle) fVarAddParameterAndReturn.f53283a;
                        operationalData = (OperationalData) fVarAddParameterAndReturn.f53284b;
                        bundle = bundle2;
                    }
                } catch (Exception unused) {
                    originalParameters = bundle;
                    originalOperationalData = operationalData;
                    bundle = originalParameters;
                    operationalData = originalOperationalData;
                }
            }
        } catch (Exception unused2) {
        }
        return new wj.f(bundle, operationalData);
    }

    public final Currency getCurrencyOfManualEvent(Bundle parameters) {
        Iterator<String> it = getCurrencyParameterEquivalents().iterator();
        while (true) {
            String string = null;
            if (!it.hasNext()) {
                return null;
            }
            String next = it.next();
            if (parameters != null) {
                try {
                    string = parameters.getString(next);
                    if (string != null && string.length() != 0) {
                        return Currency.getInstance(string);
                    }
                } catch (Exception unused) {
                    continue;
                }
            } else {
                if (string != null) {
                    return Currency.getInstance(string);
                }
                continue;
            }
        }
    }

    public final List<String> getCurrencyParameterEquivalents() {
        r rVarB = u.b(s.c());
        return ((rVarB != null ? rVarB.f48776u : null) == null || rVarB.f48776u.isEmpty()) ? defaultCurrencyParameterEquivalents : rVarB.f48776u;
    }

    public final List<wj.f> getDedupeParameters(boolean dedupingWithImplicitlyLoggedHistory) {
        r rVarB = u.b(s.c());
        if ((rVarB != null ? rVarB.f48778w : null) != null) {
            List list = rVarB.f48778w;
            List<wj.f> list2 = rVarB.f48778w;
            if (!list.isEmpty()) {
                if (!dedupingWithImplicitlyLoggedHistory) {
                    return list2;
                }
                ArrayList arrayList = new ArrayList();
                for (wj.f fVar : list2) {
                    Iterator it = ((List) fVar.f53284b).iterator();
                    while (it.hasNext()) {
                        arrayList.add(new wj.f((String) it.next(), f.C(fVar.f53283a)));
                    }
                }
                return arrayList;
            }
        }
        return defaultDedupeParameters;
    }

    public final long getDedupeWindow() {
        Long l;
        r rVarB = u.b(s.c());
        return ((rVarB != null ? rVarB.f48780y : null) == null || ((l = rVarB.f48780y) != null && l.longValue() == 0)) ? defaultDedupeWindow : rVarB.f48780y.longValue();
    }

    public final List<wj.f> getTestDedupeParameters(boolean dedupingWithImplicitlyLoggedHistory) {
        r rVarB = u.b(s.c());
        if (rVarB == null) {
            return null;
        }
        List<wj.f> list = rVarB.f48779x;
        List<wj.f> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return null;
        }
        if (!dedupingWithImplicitlyLoggedHistory) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (wj.f fVar : list) {
            Iterator it = ((List) fVar.f53284b).iterator();
            while (it.hasNext()) {
                arrayList.add(new wj.f((String) it.next(), f.C(fVar.f53283a)));
            }
        }
        return arrayList;
    }

    public final Double getValueOfManualEvent(Double valueToSum, Bundle parameters) {
        if (valueToSum != null) {
            return valueToSum;
        }
        Iterator<String> it = getValueParameterEquivalents().iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (parameters != null) {
                try {
                    return Double.valueOf(parameters.getDouble(next));
                } catch (Exception unused) {
                    continue;
                }
            }
        }
        return null;
    }

    public final List<String> getValueParameterEquivalents() {
        r rVarB = u.b(s.c());
        return ((rVarB != null ? rVarB.f48777v : null) == null || rVarB.f48777v.isEmpty()) ? defaultValueParameterEquivalents : rVarB.f48777v;
    }
}
