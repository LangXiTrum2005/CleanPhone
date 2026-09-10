package com.p004ironsource;

import com.p004ironsource.mediationsdk.logger.IronLog;
import com.p004ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class fk {

    public class a extends GZIPOutputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f25025a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(OutputStream outputStream, int i2) throws IOException {
            super(outputStream);
            this.f25025a = i2;
            if (i2 < 0 || i2 > 9) {
                return;
            }
            ((GZIPOutputStream) this).def.setLevel(i2);
        }
    }

    public static String a(byte[] bArr) {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(gZIPInputStream, "UTF-8"));
            StringBuilder sb = new StringBuilder();
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    bufferedReader.close();
                    gZIPInputStream.close();
                    byteArrayInputStream.close();
                    return sb.toString();
                }
                sb.append(line);
            }
        } catch (Exception e2) {
            q9.d().a(e2);
            IronLog.INTERNAL.error("exception while decompressing " + e2);
            return null;
        } catch (OutOfMemoryError e3) {
            q9.d().a(e3);
            String str = "Error while decompressing:" + e3.getMessage();
            IronLog.INTERNAL.error(str);
            b(str);
            return null;
        }
    }

    private static void b(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
            jSONObject.put(IronSourceConstants.EVENTS_EXT1, str);
        } catch (Exception e2) {
            q9.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
        }
        on.U().z().a(new zb(ac.TROUBLESHOOTING_FAILED_TO_GZIP, jSONObject));
    }

    public static byte[] a(String str) throws Exception {
        return a(str, -1);
    }

    public static byte[] a(String str, int i2) throws Exception {
        byte[] byteArray = new byte[0];
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(str.length());
            a aVar = new a(byteArrayOutputStream, i2);
            aVar.write(str.getBytes());
            aVar.close();
            byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (OutOfMemoryError e2) {
            q9.d().a(e2);
            String str2 = "Error while compressing:" + e2.getMessage();
            IronLog.INTERNAL.error(str2);
            b(str2);
            return byteArray;
        }
    }
}
