package ampleness;

import android.content.Context;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: DefaultAssetsUtils.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u001d\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroid/content/Context;", "context", "", "jsonFile", "attabal", "(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;", "iap_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class attabal {
    /* JADX WARN: Code duplicated, block: B:26:0x005a A[Catch: IOException -> 0x005e, DONT_GENERATE, TRY_LEAVE, TryCatch #5 {IOException -> 0x005e, blocks: (B:24:0x0055, B:26:0x005a), top: B:52:0x0055 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x0070 A[Catch: IOException -> 0x006c, FINALLY_INSNS, TRY_LEAVE, TryCatch #6 {IOException -> 0x006c, blocks: (B:34:0x0068, B:38:0x0070), top: B:54:0x0068 }] */
    public static final String attabal(Context context, String jsonFile) {
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
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
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
