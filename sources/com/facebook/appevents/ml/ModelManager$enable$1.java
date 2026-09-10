package com.facebook.appevents.ml;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 5, 1})
final class ModelManager$enable$1 implements Runnable {
    public static final ModelManager$enable$1 X = new ModelManager$enable$1();

    /* JADX WARN: Code duplicated, block: B:37:0x0075 A[Catch: all -> 0x002b, Exception -> 0x00b9, TRY_LEAVE, TryCatch #6 {Exception -> 0x00b9, all -> 0x002b, blocks: (B:5:0x000c, B:7:0x001e, B:10:0x0025, B:14:0x0033, B:17:0x0043, B:19:0x0049, B:46:0x00a1, B:52:0x00b2, B:36:0x0072, B:37:0x0075, B:45:0x0089, B:43:0x0084, B:13:0x002e), top: B:66:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:45:0x0089 A[Catch: all -> 0x002b, Exception -> 0x00b9, TryCatch #6 {Exception -> 0x00b9, all -> 0x002b, blocks: (B:5:0x000c, B:7:0x001e, B:10:0x0025, B:14:0x0033, B:17:0x0043, B:19:0x0049, B:46:0x00a1, B:52:0x00b2, B:36:0x0072, B:37:0x0075, B:45:0x0089, B:43:0x0084, B:13:0x002e), top: B:66:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:62:0x007e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0069, code lost:
    
        if ((java.lang.System.currentTimeMillis() - r8) < 259200000) goto L46;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r12 = this;
            java.lang.String r0 = "model_request_timestamp"
            java.lang.String r1 = "models"
            boolean r2 = com.facebook.internal.instrument.crashshield.CrashShieldHandler.b(r12)
            if (r2 == 0) goto Lc
            goto Lb9
        Lc:
            android.content.Context r2 = com.facebook.FacebookSdk.b()     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> Lb9
            java.lang.String r3 = "com.facebook.internal.MODEL_STORE"
            r4 = 0
            android.content.SharedPreferences r2 = r2.getSharedPreferences(r3, r4)     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> Lb9
            r3 = 0
            java.lang.String r4 = r2.getString(r1, r3)     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> Lb9
            if (r4 == 0) goto L2e
            int r5 = r4.length()     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> Lb9
            if (r5 != 0) goto L25
            goto L2e
        L25:
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> Lb9
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> Lb9
            goto L33
        L2b:
            r0 = move-exception
            goto Lb6
        L2e:
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> Lb9
            r5.<init>()     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> Lb9
        L33:
            r6 = 0
            long r8 = r2.getLong(r0, r6)     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> Lb9
            com.facebook.internal.FeatureManager$Feature r4 = com.facebook.internal.FeatureManager.Feature.ModelRequest     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> Lb9
            boolean r4 = com.facebook.internal.FeatureManager.b(r4)     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> Lb9
            java.lang.Class<com.facebook.appevents.ml.ModelManager> r10 = com.facebook.appevents.ml.ModelManager.class
            if (r4 == 0) goto L75
            int r4 = r5.length()     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> Lb9
            if (r4 == 0) goto L75
            com.facebook.appevents.ml.ModelManager r4 = com.facebook.appevents.ml.ModelManager.d     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> Lb9
            boolean r11 = com.facebook.internal.instrument.crashshield.CrashShieldHandler.b(r10)     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> Lb9
            if (r11 == 0) goto L52
            goto L75
        L52:
            boolean r11 = com.facebook.internal.instrument.crashshield.CrashShieldHandler.b(r4)     // Catch: java.lang.Throwable -> L71
            if (r11 == 0) goto L59
            goto L75
        L59:
            int r6 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r6 != 0) goto L5e
            goto L75
        L5e:
            long r6 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L6c
            long r6 = r6 - r8
            r4 = 259200000(0xf731400, float:1.1984677E-29)
            long r8 = (long) r4
            int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r4 >= 0) goto L75
            goto La1
        L6c:
            r5 = move-exception
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.a(r4, r5)     // Catch: java.lang.Throwable -> L71
            goto L75
        L71:
            r4 = move-exception
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.a(r10, r4)     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> Lb9
        L75:
            com.facebook.appevents.ml.ModelManager r4 = com.facebook.appevents.ml.ModelManager.d     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> Lb9
            boolean r5 = com.facebook.internal.instrument.crashshield.CrashShieldHandler.b(r10)     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> Lb9
            if (r5 == 0) goto L7e
            goto L87
        L7e:
            org.json.JSONObject r3 = r4.d()     // Catch: java.lang.Throwable -> L83
            goto L87
        L83:
            r4 = move-exception
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.a(r10, r4)     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> Lb9
        L87:
            if (r3 == 0) goto Lb9
            android.content.SharedPreferences$Editor r2 = r2.edit()     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> Lb9
            java.lang.String r4 = r3.toString()     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> Lb9
            android.content.SharedPreferences$Editor r1 = r2.putString(r1, r4)     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> Lb9
            long r4 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> Lb9
            android.content.SharedPreferences$Editor r0 = r1.putLong(r0, r4)     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> Lb9
            r0.apply()     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> Lb9
            r5 = r3
        La1:
            com.facebook.appevents.ml.ModelManager r0 = com.facebook.appevents.ml.ModelManager.d     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> Lb9
            com.facebook.appevents.ml.ModelManager.a(r5)     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> Lb9
            boolean r1 = com.facebook.internal.instrument.crashshield.CrashShieldHandler.b(r10)     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> Lb9
            if (r1 == 0) goto Lad
            goto Lb9
        Lad:
            r0.c()     // Catch: java.lang.Throwable -> Lb1
            goto Lb9
        Lb1:
            r0 = move-exception
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.a(r10, r0)     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> Lb9
            goto Lb9
        Lb6:
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.a(r12, r0)
        Lb9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.ml.ModelManager$enable$1.run():void");
    }
}
