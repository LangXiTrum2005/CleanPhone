package com.apm.insight.k;

import com.apm.insight.CustomRequestHeader;
import com.apm.insight.MonitorCrash;
import com.applovin.shadow.okio.Segment;
import com.p004ironsource.ko;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f10206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HttpURLConnection f10207b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f10208c;
    private boolean d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private f f10209e;
    private k f;

    public i(String str, String str2, boolean z2) throws IOException {
        this.f10208c = str2;
        this.d = z2;
        String str3 = "AAA" + System.currentTimeMillis() + "AAA";
        this.f10206a = str3;
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        this.f10207b = httpURLConnection;
        httpURLConnection.setUseCaches(false);
        this.f10207b.setDoOutput(true);
        this.f10207b.setDoInput(true);
        this.f10207b.setRequestMethod(ko.f25535b);
        CustomRequestHeader customRequestHeader = MonitorCrash.mCustomRequestHeader;
        if (customRequestHeader != null) {
            customRequestHeader.addRequestHeader(this.f10207b);
        }
        this.f10207b.setRequestProperty("Content-Type", "multipart/form-data; boundary=" + str3);
        if (!z2) {
            this.f10209e = new f(this.f10207b.getOutputStream());
        } else {
            this.f10207b.setRequestProperty("Content-Encoding", com.smartdigimkt.o0.b.d);
            this.f = new k(this.f10207b.getOutputStream());
        }
    }

    public final void a(String str, String str2) {
        b(str, str2);
    }

    public final void b(String str, String str2) {
        StringBuilder sb = new StringBuilder("--");
        androidx.media3.extractor.text.ttml.a.C(sb, this.f10206a, "\r\nContent-Disposition: form-data; name=\"", str, "\"\r\nContent-Type: text/plain; charset=");
        sb.append(this.f10208c);
        sb.append("\r\n\r\n");
        try {
            if (this.d) {
                this.f.write(sb.toString().getBytes());
            } else {
                this.f10209e.write(sb.toString().getBytes());
            }
        } catch (IOException unused) {
        }
        byte[] bytes = str2.getBytes();
        try {
            if (this.d) {
                this.f.write(bytes);
                this.f.write(IOUtils.LINE_SEPARATOR_WINDOWS.getBytes());
            } else {
                this.f10209e.write(bytes);
                this.f10209e.write(IOUtils.LINE_SEPARATOR_WINDOWS.getBytes());
            }
        } catch (IOException unused2) {
        }
    }

    public final void a(String str, File... fileArr) throws Throwable {
        StringBuilder sb = new StringBuilder("--");
        androidx.media3.extractor.text.ttml.a.C(sb, this.f10206a, "\r\nContent-Disposition: form-data; name=\"", str, "\"; filename=\"");
        sb.append(str);
        sb.append("\"\r\nContent-Transfer-Encoding: binary\r\n\r\n");
        if (this.d) {
            this.f.write(sb.toString().getBytes());
        } else {
            this.f10209e.write(sb.toString().getBytes());
        }
        if (this.d) {
            com.apm.insight.l.f.a(this.f, fileArr);
        } else {
            com.apm.insight.l.f.a(this.f10209e, fileArr);
        }
        if (this.d) {
            this.f.write(IOUtils.LINE_SEPARATOR_WINDOWS.getBytes());
        } else {
            this.f10209e.write(IOUtils.LINE_SEPARATOR_WINDOWS.getBytes());
            this.f10209e.flush();
        }
    }

    public final void a(String str, File file, Map<String, String> map) throws IOException {
        String name = file.getName();
        StringBuilder sb = new StringBuilder("--");
        androidx.media3.extractor.text.ttml.a.C(sb, this.f10206a, "\r\nContent-Disposition: form-data; name=\"", str, "\"; filename=\"");
        sb.append(name);
        sb.append("\"");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            sb.append("; ");
            sb.append(entry.getKey());
            sb.append("=\"");
            sb.append(entry.getValue());
            sb.append("\"");
        }
        sb.append("\r\nContent-Transfer-Encoding: binary\r\n\r\n");
        if (this.d) {
            this.f.write(sb.toString().getBytes());
        } else {
            this.f10209e.write(sb.toString().getBytes());
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        byte[] bArr = new byte[Segment.SIZE];
        while (true) {
            int i2 = fileInputStream.read(bArr);
            if (i2 == -1) {
                break;
            } else if (this.d) {
                this.f.write(bArr, 0, i2);
            } else {
                this.f10209e.write(bArr, 0, i2);
            }
        }
        fileInputStream.close();
        if (this.d) {
            this.f.write(IOUtils.LINE_SEPARATOR_WINDOWS.getBytes());
        } else {
            this.f10209e.write(IOUtils.LINE_SEPARATOR_WINDOWS.getBytes());
            this.f10209e.flush();
        }
    }

    public final String a() throws IOException {
        ArrayList arrayList = new ArrayList();
        byte[] bytes = ("\r\n--" + this.f10206a + "--\r\n").getBytes();
        if (this.d) {
            this.f.write(bytes);
            this.f.b();
            this.f.a();
        } else {
            this.f10209e.write(bytes);
            this.f10209e.flush();
            this.f10209e.a();
        }
        int responseCode = this.f10207b.getResponseCode();
        if (responseCode == 200) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.f10207b.getInputStream()));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                arrayList.add(line);
            }
            bufferedReader.close();
            this.f10207b.disconnect();
            StringBuilder sb = new StringBuilder();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                sb.append((String) it.next());
            }
            return sb.toString();
        }
        throw new IOException("Server returned non-OK status: ".concat(String.valueOf(responseCode)));
    }
}
