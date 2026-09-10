package com.mbridge.msdk.config.component.common.express.node;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class i extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    String f31898a;

    public i(String str) {
        this.f31898a = str;
    }

    @Override // com.mbridge.msdk.config.component.common.express.node.d
    public Object a(com.mbridge.msdk.config.component.common.express.d dVar, com.mbridge.msdk.config.component.common.express.e eVar, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        Object objSubstring;
        if (this.f31898a.startsWith("$")) {
            objSubstring = com.mbridge.msdk.config.component.common.express.c.a(this.f31898a, aVar);
        } else if (this.f31898a.startsWith("\\") && this.f31898a.endsWith("\\\"")) {
            StringBuilder sb2 = new StringBuilder();
            String str = this.f31898a;
            sb2.append(str.substring(1, str.length() - 2));
            sb2.append("\"");
            objSubstring = sb2.toString();
        } else if (this.f31898a.startsWith("\"") && this.f31898a.endsWith("\"")) {
            String str2 = this.f31898a;
            objSubstring = str2.substring(1, str2.length() - 1);
        } else {
            objSubstring = this.f31898a;
        }
        if (eVar != com.mbridge.msdk.config.component.common.express.e.ASSIGNMENT) {
            return objSubstring;
        }
        com.mbridge.msdk.config.component.common.express.entities.a aVar2 = new com.mbridge.msdk.config.component.common.express.entities.a();
        aVar2.a(aVar);
        aVar2.a(this.f31898a.substring(1));
        return aVar2;
    }
}
