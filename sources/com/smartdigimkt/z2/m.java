package com.smartdigimkt.z2;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import com.p004ironsource.d9;
import com.smartdigimkt.expressad.video.module.AnythinkContainerView;
import com.smartdigimkt.v0.x;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class m extends f {

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private Activity f40333Y;
    private AnythinkContainerView Z;

    public m(Activity activity, AnythinkContainerView anythinkContainerView) {
        this.f40333Y = activity;
        this.Z = anythinkContainerView;
    }

    private com.smartdigimkt.f3.d b(String str) {
        if (com.smartdigimkt.f3.c.b() == null) {
            return null;
        }
        return com.smartdigimkt.f3.c.b().b(com.smartdigimkt.u.a.f().a(), str);
    }

    @Override // com.smartdigimkt.z2.f, com.smartdigimkt.x2.i
    public String a() {
        if (this.Z == null) {
            super.a();
        } else {
            try {
                ArrayList arrayList = new ArrayList();
                arrayList.add(this.Z.getCampaign());
                String unitID = this.Z.getUnitID();
                String str = com.smartdigimkt.f1.b.f34972a + ",3.0.1";
                com.smartdigimkt.f3.d dVarB = b(unitID);
                JSONObject jSONObject = new JSONObject();
                if (dVarB != null) {
                    jSONObject = dVarB.b0();
                }
                Objects.toString(this.Z.getCampaign());
                return a(arrayList, unitID, str, jSONObject);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return super.a();
    }

    @Override // com.smartdigimkt.z2.f, com.smartdigimkt.x2.i, com.smartdigimkt.x2.h
    public void handlerPlayableException(String str) {
        AnythinkContainerView anythinkContainerView;
        super.handlerPlayableException(str);
        try {
            if (this.f40333Y == null || TextUtils.isEmpty(str) || (anythinkContainerView = this.Z) == null) {
                return;
            }
            anythinkContainerView.handlerPlayableException(str);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.smartdigimkt.z2.f, com.smartdigimkt.x2.h
    public void install(com.smartdigimkt.x.d dVar) {
        super.install(dVar);
        AnythinkContainerView anythinkContainerView = this.Z;
        if (anythinkContainerView != null) {
            anythinkContainerView.install(dVar);
        }
    }

    @Override // com.smartdigimkt.z2.f, com.smartdigimkt.x2.h
    public void notifyCloseBtn(int i2) {
        super.notifyCloseBtn(i2);
        AnythinkContainerView anythinkContainerView = this.Z;
        if (anythinkContainerView != null) {
            anythinkContainerView.notifyCloseBtn(i2);
        }
    }

    @Override // com.smartdigimkt.z2.f, com.smartdigimkt.x2.h
    public void orientation(Configuration configuration) {
        super.orientation(configuration);
        try {
            AnythinkContainerView anythinkContainerView = this.Z;
            if (anythinkContainerView != null) {
                anythinkContainerView.orientation(configuration);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.smartdigimkt.z2.f, com.smartdigimkt.x2.h
    public void toggleCloseBtn(int i2) {
        super.toggleCloseBtn(i2);
        AnythinkContainerView anythinkContainerView = this.Z;
        if (anythinkContainerView != null) {
            anythinkContainerView.toggleCloseBtn(i2);
        }
    }

    @Override // com.smartdigimkt.z2.f, com.smartdigimkt.x2.i
    public void triggerCloseBtn(String str) {
        AnythinkContainerView anythinkContainerView;
        super.triggerCloseBtn(str);
        try {
            if (this.f40333Y == null || TextUtils.isEmpty(str) || !str.equals("click") || (anythinkContainerView = this.Z) == null) {
                return;
            }
            anythinkContainerView.triggerCloseBtn(str);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.smartdigimkt.z2.f, com.smartdigimkt.x2.h
    public void webviewshow() {
        super.webviewshow();
        try {
            AnythinkContainerView anythinkContainerView = this.Z;
            if (anythinkContainerView != null) {
                anythinkContainerView.webviewshow();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.smartdigimkt.z2.f, com.smartdigimkt.x2.i
    public void a(String str) {
        super.a(str);
        try {
            if (this.f40333Y == null || TextUtils.isEmpty(str)) {
                return;
            }
            if (str.equals(d9.h.C)) {
                this.f40333Y.setRequestedOrientation(0);
            } else if (str.equals(d9.h.D)) {
                this.f40333Y.setRequestedOrientation(1);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private String a(List<com.smartdigimkt.x.d> list, String str, String str2, JSONObject jSONObject) {
        if (list == null) {
            return null;
        }
        try {
            if (list.size() <= 0) {
                return null;
            }
            com.smartdigimkt.v0.b bVar = new com.smartdigimkt.v0.b(com.smartdigimkt.u.a.f().d());
            JSONArray jSONArrayA = com.smartdigimkt.x.d.a(list);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("campaignList", jSONArrayA);
            jSONObject2.put(d9.h.G, bVar.a());
            jSONObject2.put("unit_id", str);
            jSONObject2.put("sdk_info", str2);
            jSONObject2.put("unitSetting", jSONObject);
            if (com.smartdigimkt.n1.b.b() != null) {
                String strD = com.smartdigimkt.n1.b.b().d(com.smartdigimkt.u.a.f().a());
                if (!TextUtils.isEmpty(strD)) {
                    JSONObject jSONObject3 = new JSONObject(strD);
                    a(jSONObject3, str);
                    String strB = com.smartdigimkt.n1.b.b().b(str);
                    if (!TextUtils.isEmpty(strB)) {
                        jSONObject3.put("ivreward", new JSONObject(strB));
                    }
                    jSONObject2.put("appSetting", jSONObject3);
                }
            }
            return jSONObject2.toString();
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    private void a(JSONObject jSONObject, String str) {
        try {
            Context contextD = com.smartdigimkt.u.a.f().d();
            String string = x.b(contextD, "Anythink_ConfirmTitle" + str, "").toString();
            String string2 = x.b(contextD, "Anythink_ConfirmContent" + str, "").toString();
            String string3 = x.b(contextD, "Anythink_CancelText" + str, "").toString();
            String string4 = x.b(contextD, "Anythink_ConfirmText" + str, "").toString();
            if (!TextUtils.isEmpty(string)) {
                jSONObject.put(com.smartdigimkt.o1.b.u2, string);
            }
            if (!TextUtils.isEmpty(string2)) {
                jSONObject.put(com.smartdigimkt.o1.b.v2, string2);
            }
            if (!TextUtils.isEmpty(string3)) {
                jSONObject.put(com.smartdigimkt.o1.b.w2, string3);
            }
            if (!TextUtils.isEmpty(string4)) {
                jSONObject.put(com.smartdigimkt.o1.b.y2, string4);
            }
            if (TextUtils.isEmpty(string4)) {
                return;
            }
            jSONObject.put(com.smartdigimkt.o1.b.x2, string4);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
