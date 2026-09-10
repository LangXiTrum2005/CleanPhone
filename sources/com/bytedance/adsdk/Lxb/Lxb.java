package com.bytedance.adsdk.Lxb;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class Lxb implements com.bytedance.adsdk.ugeno.lk.Lxb {

    /* JADX INFO: renamed from: com.bytedance.adsdk.Lxb.Lxb$Lxb, reason: collision with other inner class name */
    public static class C0026Lxb implements com.bytedance.adsdk.ugeno.lk.Lxb.InterfaceC0041Lxb {
        private String LD;
        private com.bytedance.adsdk.Lxb.LD.Lxb Lxb;

        private C0026Lxb(String str) {
            this.LD = str;
            this.Lxb = com.bytedance.adsdk.Lxb.LD.Lxb.Lxb(str);
        }

        public static C0026Lxb Lxb(String str) {
            return new C0026Lxb(str);
        }

        @Override // com.bytedance.adsdk.ugeno.lk.Lxb.InterfaceC0041Lxb
        public Object Lxb(JSONObject jSONObject) {
            com.bytedance.adsdk.Lxb.LD.Lxb lxb = this.Lxb;
            if (lxb == null) {
                return this.LD;
            }
            Object objLxb = lxb.Lxb(jSONObject);
            if (objLxb instanceof String) {
                return objLxb;
            }
            return objLxb instanceof com.bytedance.adsdk.Lxb.LD.Lxb.Lxb ? String.valueOf(ebl.Lxb((com.bytedance.adsdk.Lxb.LD.Lxb.Lxb) objLxb)) : String.valueOf(objLxb);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.lk.Lxb
    public com.bytedance.adsdk.ugeno.lk.Lxb.InterfaceC0041Lxb Lxb(String str) {
        return C0026Lxb.Lxb(str);
    }
}
