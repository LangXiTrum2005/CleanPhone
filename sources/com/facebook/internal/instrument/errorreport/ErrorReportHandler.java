package com.facebook.internal.instrument.errorreport;

import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.UserSettingsManager;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.InstrumentUtility;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/facebook/internal/instrument/errorreport/ErrorReportHandler;", "", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class ErrorReportHandler {
    public static final void a() {
        File[] fileArrListFiles;
        HashSet hashSet = FacebookSdk.f15915a;
        if (!UserSettingsManager.c() || Utility.B()) {
            return;
        }
        File fileB = InstrumentUtility.b();
        if (fileB != null) {
            fileArrListFiles = fileB.listFiles(ErrorReportHandler$listErrorReportFiles$1.f16438a);
            Intrinsics.e(fileArrListFiles, "reportDir.listFiles { di…OR_REPORT_PREFIX)))\n    }");
        } else {
            fileArrListFiles = new File[0];
        }
        final ArrayList arrayList = new ArrayList();
        for (File file : fileArrListFiles) {
            Intrinsics.f(file, "file");
            ErrorReportData errorReportData = new ErrorReportData();
            String name = file.getName();
            Intrinsics.e(name, "file.name");
            errorReportData.f16435a = name;
            JSONObject jSONObjectF = InstrumentUtility.f(name);
            if (jSONObjectF != null) {
                errorReportData.f16437c = Long.valueOf(jSONObjectF.optLong("timestamp", 0L));
                errorReportData.f16436b = jSONObjectF.optString("error_message", null);
            }
            if (errorReportData.f16436b != null && errorReportData.f16437c != null) {
                arrayList.add(errorReportData);
            }
        }
        CollectionsKt.a0(arrayList, ErrorReportHandler$sendErrorReports$1.X);
        JSONArray jSONArray = new JSONArray();
        for (int i2 = 0; i2 < arrayList.size() && i2 < 1000; i2++) {
            jSONArray.put(arrayList.get(i2));
        }
        InstrumentUtility.g("error_reports", jSONArray, new GraphRequest.Callback() { // from class: com.facebook.internal.instrument.errorreport.ErrorReportHandler$sendErrorReports$2
            @Override // com.facebook.GraphRequest.Callback
            public final void a(GraphResponse graphResponse) {
                JSONObject jSONObject;
                try {
                    if (graphResponse.d == null && (jSONObject = graphResponse.f15950a) != null && jSONObject.getBoolean("success")) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            InstrumentUtility.a(((ErrorReportData) it.next()).f16435a);
                        }
                    }
                } catch (JSONException unused) {
                }
            }
        });
    }
}
