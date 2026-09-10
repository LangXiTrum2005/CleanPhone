package com.facebook.internal.instrument.anrreport;

import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.InstrumentData;
import com.facebook.internal.instrument.InstrumentUtility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.ranges.IntProgressionIterator;
import kotlin.ranges.RangesKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/facebook/internal/instrument/anrreport/ANRHandler;", "", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class ANRHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicBoolean f16427a = new AtomicBoolean(false);

    public static final void a() {
        if (CrashShieldHandler.b(ANRHandler.class)) {
            return;
        }
        try {
            if (Utility.B()) {
                return;
            }
            File[] fileArrD = InstrumentUtility.d();
            ArrayList arrayList = new ArrayList(fileArrD.length);
            for (File file : fileArrD) {
                arrayList.add(InstrumentData.Builder.c(file));
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (((InstrumentData) obj).a()) {
                    arrayList2.add(obj);
                }
            }
            final List listC0 = CollectionsKt.c0(ANRHandler$sendANRReports$validReports$3.X, arrayList2);
            JSONArray jSONArray = new JSONArray();
            Iterator<Integer> it = RangesKt.e(0, Math.min(listC0.size(), 5)).iterator();
            while (((IntProgressionIterator) it).Z) {
                jSONArray.put(listC0.get(((IntIterator) it).a()));
            }
            InstrumentUtility.g("anr_reports", jSONArray, new GraphRequest.Callback() { // from class: com.facebook.internal.instrument.anrreport.ANRHandler$sendANRReports$2
                @Override // com.facebook.GraphRequest.Callback
                public final void a(GraphResponse graphResponse) {
                    JSONObject jSONObject;
                    try {
                        if (graphResponse.d == null && (jSONObject = graphResponse.f15950a) != null && jSONObject.getBoolean("success")) {
                            Iterator it2 = listC0.iterator();
                            while (it2.hasNext()) {
                                InstrumentUtility.a(((InstrumentData) it2.next()).f16413a);
                            }
                        }
                    } catch (JSONException unused) {
                    }
                }
            });
        } catch (Throwable th) {
            CrashShieldHandler.a(ANRHandler.class, th);
        }
    }
}
