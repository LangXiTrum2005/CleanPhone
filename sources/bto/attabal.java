package bto;

import android.content.Context;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AssetsUtil.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lbto/attabal;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "jsonFile", "attabal", "(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;", "referrerlibrary_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class attabal {
    /* JADX WARN: Code duplicated, block: B:28:0x005d A[Catch: IOException -> 0x0059, DONT_GENERATE, TRY_LEAVE, TryCatch #0 {IOException -> 0x0059, blocks: (B:24:0x0055, B:28:0x005d), top: B:43:0x0055 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x0072 A[Catch: IOException -> 0x006e, FINALLY_INSNS, TRY_LEAVE, TryCatch #6 {IOException -> 0x006e, blocks: (B:35:0x006a, B:39:0x0072), top: B:55:0x006a }] */
    public final String attabal(Context context, String jsonFile) {
        BufferedReader bufferedReader;
        Throwable th;
        InputStream inputStreamOpen;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(jsonFile, "jsonFile");
        try {
            StringBuilder sb = new StringBuilder();
            inputStreamOpen = context.getAssets().open(jsonFile);
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpen));
                while (true) {
                    try {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        sb.append(line);
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            th.printStackTrace();
                            if (inputStreamOpen != null) {
                                try {
                                } catch (IOException e) {
                                    return "";
                                }
                            }
                            return "";
                        } finally {
                            if (inputStreamOpen != null) {
                                try {
                                    inputStreamOpen.close();
                                    if (bufferedReader != null) {
                                        bufferedReader.close();
                                    }
                                } catch (IOException e2) {
                                    e2.printStackTrace();
                                }
                            } else if (bufferedReader != null) {
                                bufferedReader.close();
                            }
                        }
                    }
                }
                String string = sb.toString();
                Intrinsics.checkNotNullExpressionValue(string, "stringBuilder.toString()");
                if (inputStreamOpen != null) {
                    try {
                        inputStreamOpen.close();
                    } catch (IOException e3) {
                        e3.printStackTrace();
                        return string;
                    }
                }
                bufferedReader.close();
                return string;
            } catch (Throwable th3) {
                th = th3;
                bufferedReader = null;
            }
        } catch (Throwable th4) {
            bufferedReader = null;
            th = th4;
            inputStreamOpen = null;
        }
    }
}
