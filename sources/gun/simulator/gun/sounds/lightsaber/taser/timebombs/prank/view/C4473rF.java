package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.Map;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.rF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4473rF extends WG implements InterfaceC2766Sw {
    public static final C4473rF g = new C4473rF(0);
    public static final C4473rF h = new C4473rF(1);
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4473rF(int i) {
        super(1);
        this.f = i;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw
    public final Object invoke(Object obj) {
        switch (this.f) {
            case 0:
                C3275df c3275df = (C3275df) obj;
                AbstractC2995aW.q(c3275df, "$this$buildSerialDescriptor");
                C3275df.a(c3275df, "JsonPrimitive", new C4649tF(C4386qF.g));
                C3275df.a(c3275df, "JsonNull", new C4649tF(C4386qF.h));
                C3275df.a(c3275df, "JsonLiteral", new C4649tF(C4386qF.i));
                C3275df.a(c3275df, "JsonObject", new C4649tF(C4386qF.j));
                C3275df.a(c3275df, "JsonArray", new C4649tF(C4386qF.k));
                return C5033xf0.f5238a;
            default:
                Map.Entry entry = (Map.Entry) obj;
                AbstractC2995aW.q(entry, "<name for destructuring parameter 0>");
                String str = (String) entry.getKey();
                AbstractC4122nF abstractC4122nF = (AbstractC4122nF) entry.getValue();
                StringBuilder sb = new StringBuilder();
                V90.a(sb, str);
                sb.append(':');
                sb.append(abstractC4122nF);
                String string = sb.toString();
                AbstractC2995aW.p(string, "StringBuilder().apply(builderAction).toString()");
                return string;
        }
    }
}
