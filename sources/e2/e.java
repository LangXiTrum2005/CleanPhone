package e2;

import android.util.Base64;
import h3.o;
import h3.q;
import java.util.UUID;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends com.unity3d.scar.adapter.common.h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f39046e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public UUID f39047f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public byte[] f39048g;

    @Override // com.unity3d.scar.adapter.common.h
    public final Object e() {
        UUID uuid = this.f39047f;
        byte[] bArrA = o.a(uuid, null, this.f39048g);
        byte[] bArr = this.f39048g;
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < bArr.length; i10 += 2) {
            sb2.append((char) bArr[i10]);
        }
        String string = sb2.toString();
        byte[] bArrDecode = Base64.decode(string.substring(string.indexOf("<KID>") + 5, string.indexOf("</KID>")), 0);
        byte b10 = bArrDecode[0];
        bArrDecode[0] = bArrDecode[3];
        bArrDecode[3] = b10;
        byte b11 = bArrDecode[1];
        bArrDecode[1] = bArrDecode[2];
        bArrDecode[2] = b11;
        byte b12 = bArrDecode[4];
        bArrDecode[4] = bArrDecode[5];
        bArrDecode[5] = b12;
        byte b13 = bArrDecode[6];
        bArrDecode[6] = bArrDecode[7];
        bArrDecode[7] = b13;
        return new a(uuid, bArrA, new q[]{new q(true, null, 8, bArrDecode, 0, 0, null)});
    }

    @Override // com.unity3d.scar.adapter.common.h
    public final boolean g(String str) {
        return "ProtectionHeader".equals(str);
    }

    @Override // com.unity3d.scar.adapter.common.h
    public final void i(XmlPullParser xmlPullParser) {
        if ("ProtectionHeader".equals(xmlPullParser.getName())) {
            this.f39046e = false;
        }
    }

    @Override // com.unity3d.scar.adapter.common.h
    public final void m(XmlPullParser xmlPullParser) {
        if ("ProtectionHeader".equals(xmlPullParser.getName())) {
            this.f39046e = true;
            String attributeValue = xmlPullParser.getAttributeValue(null, "SystemID");
            if (attributeValue.charAt(0) == '{' && attributeValue.charAt(attributeValue.length() - 1) == '}') {
                attributeValue = attributeValue.substring(1, attributeValue.length() - 1);
            }
            this.f39047f = UUID.fromString(attributeValue);
        }
    }

    @Override // com.unity3d.scar.adapter.common.h
    public final void n(XmlPullParser xmlPullParser) {
        if (this.f39046e) {
            this.f39048g = Base64.decode(xmlPullParser.getText(), 0);
        }
    }
}
