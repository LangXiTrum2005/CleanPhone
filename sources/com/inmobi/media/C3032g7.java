package com.inmobi.media;

import com.p004ironsource.ko;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.g7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3032g7 extends N9 {
    public final Y6 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3032g7(String url, Y6 data) {
        super(ko.f25535b, url, (C3262ue) null, true, (InterfaceC3333z5) null, "application/json", 64);
        Intrinsics.f(url, "url");
        Intrinsics.f(data, "data");
        this.y = data;
    }

    public static String a(String str) {
        File file = new File(str);
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                sb.append(line);
                sb.append('\n');
            }
            bufferedReader.close();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
        String string = sb.toString();
        Intrinsics.e(string, "toString(...)");
        return string;
    }

    @Override // com.inmobi.media.N9
    public final void f() {
        super.f();
        this.t = false;
        this.f23014u = false;
        this.x = false;
        try {
            this.f23011l = new JSONObject(a(this.y.f23367a));
        } catch (FileNotFoundException unused) {
            String strR = android.support.v4.media.a.r(new StringBuilder("File - "), this.y.f23367a, " not found");
            P9 p9 = new P9();
            p9.d = new I9(EnumC3157o4.s, strR);
            this.f23012n = p9;
        } catch (IOException unused2) {
            String str = "IOException while reading file - " + this.y.f23367a;
            P9 p10 = new P9();
            p10.d = new I9(EnumC3157o4.s, str);
            this.f23012n = p10;
        } catch (JSONException unused3) {
            String str2 = "JSON exception while parsing file - " + this.y.f23367a;
            P9 p11 = new P9();
            p11.d = new I9(EnumC3157o4.s, str2);
            this.f23012n = p11;
        }
    }
}
