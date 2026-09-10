package com.ironsource.sdk.controller;

import android.app.Activity;
import android.content.Context;
import com.ironsource.C0514p8;
import com.ironsource.InterfaceC0563s4;
import com.ironsource.InterfaceC0581t4;
import com.ironsource.InterfaceC0599u4;
import com.ironsource.Nb;
import com.ironsource.T4;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public interface l {

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public interface a {
        void a(f.a aVar);
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public interface b {
        void a(Nb nb2);
    }

    void a();

    void a(Activity activity);

    void a(Context context);

    void a(T4 t10);

    void a(T4 t10, Map<String, String> map, InterfaceC0563s4 interfaceC0563s4);

    void a(T4 t10, Map<String, String> map, InterfaceC0581t4 interfaceC0581t4);

    void a(f.c cVar, a aVar);

    void a(String str, InterfaceC0581t4 interfaceC0581t4);

    void a(String str, String str2, T4 t10, InterfaceC0563s4 interfaceC0563s4);

    void a(String str, String str2, T4 t10, InterfaceC0581t4 interfaceC0581t4);

    void a(String str, String str2, T4 t10, InterfaceC0599u4 interfaceC0599u4);

    void a(JSONObject jSONObject);

    void a(JSONObject jSONObject, InterfaceC0563s4 interfaceC0563s4);

    void a(JSONObject jSONObject, InterfaceC0581t4 interfaceC0581t4);

    void a(JSONObject jSONObject, InterfaceC0599u4 interfaceC0599u4);

    boolean a(String str);

    void b();

    void b(Context context);

    void b(T4 t10);

    void b(T4 t10, Map<String, String> map, InterfaceC0581t4 interfaceC0581t4);

    void b(JSONObject jSONObject);

    void e();

    @Deprecated
    void f();

    void g();

    C0514p8.c h();
}
