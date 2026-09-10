package com.facebook.internal.instrument;

import android.util.Log;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.GraphRequestBatch;
import com.facebook.GraphResponse;
import com.facebook.UserSettingsManager;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.crashreport.CrashHandler;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import kotlin.Metadata;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "enabled", "", "onCompleted"}, k = 3, mv = {1, 5, 1})
final class InstrumentManager$start$1 implements FeatureManager.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final InstrumentManager$start$1 f16418a = new InstrumentManager$start$1();

    @Override // com.facebook.internal.FeatureManager.Callback
    public final void a(boolean z2) {
        File[] fileArrListFiles;
        if (z2) {
            synchronized (CrashHandler.f16430c) {
                HashSet hashSet = FacebookSdk.f15915a;
                if (UserSettingsManager.c()) {
                    CrashHandler.Companion.a();
                }
                if (CrashHandler.f16429b != null) {
                    Log.w("com.facebook.internal.instrument.crashreport.CrashHandler", "Already enabled!");
                } else {
                    CrashHandler crashHandler = new CrashHandler(Thread.getDefaultUncaughtExceptionHandler());
                    CrashHandler.f16429b = crashHandler;
                    Thread.setDefaultUncaughtExceptionHandler(crashHandler);
                }
            }
            if (FeatureManager.b(FeatureManager.Feature.CrashShield)) {
                ExceptionAnalyzer.f16411a = true;
                if (UserSettingsManager.c() && !Utility.B()) {
                    File fileB = InstrumentUtility.b();
                    if (fileB != null) {
                        fileArrListFiles = fileB.listFiles(InstrumentUtility$listExceptionAnalysisReportFiles$reports$1.f16422a);
                        if (fileArrListFiles == null) {
                            fileArrListFiles = new File[0];
                        }
                    } else {
                        fileArrListFiles = new File[0];
                    }
                    ArrayList arrayList = new ArrayList();
                    for (File file : fileArrListFiles) {
                        final InstrumentData instrumentDataC = InstrumentData.Builder.c(file);
                        if (instrumentDataC.a()) {
                            JSONObject jSONObject = new JSONObject();
                            try {
                                jSONObject.put("crash_shield", instrumentDataC.toString());
                                String str = GraphRequest.j;
                                arrayList.add(GraphRequest.Companion.g(null, String.format("%s/instruments", Arrays.copyOf(new Object[]{FacebookSdk.c()}, 1)), jSONObject, new GraphRequest.Callback() { // from class: com.facebook.internal.instrument.ExceptionAnalyzer$sendExceptionAnalysisReports$request$1
                                    @Override // com.facebook.GraphRequest.Callback
                                    public final void a(GraphResponse graphResponse) {
                                        JSONObject jSONObject2;
                                        try {
                                            if (graphResponse.d == null && (jSONObject2 = graphResponse.f15950a) != null && jSONObject2.getBoolean("success")) {
                                                InstrumentUtility.a(instrumentDataC.f16413a);
                                            }
                                        } catch (JSONException unused) {
                                        }
                                    }
                                }));
                            } catch (JSONException unused) {
                            }
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        new GraphRequestBatch(arrayList).d();
                    }
                }
                CrashShieldHandler.f16434b = true;
            }
            FeatureManager.b(FeatureManager.Feature.ThreadCheck);
        }
    }
}
