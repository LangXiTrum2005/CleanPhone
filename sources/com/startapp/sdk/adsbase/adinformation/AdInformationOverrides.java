package com.startapp.sdk.adsbase.adinformation;

import com.startapp.json.TypeInfo;
import java.io.Serializable;

/* JADX INFO: loaded from: classes6.dex */
public class AdInformationOverrides implements Serializable {
    private static final long serialVersionUID = -5967960110869168470L;
    private boolean enableOverride = false;
    private boolean enable = true;
    private boolean positionOverride = false;

    @TypeInfo(type = AdInformationPositions.Position.class)
    private AdInformationPositions.Position position = AdInformationPositions.Position.getByName(AdInformationPositions.DEFAULT_POSITION);

    private AdInformationOverrides() {
    }

    public static AdInformationOverrides a() {
        return new AdInformationOverrides();
    }

    public final AdInformationPositions.Position b() {
        return this.position;
    }

    public final boolean c() {
        return this.enable;
    }

    public final boolean d() {
        return this.enableOverride;
    }

    public final boolean e() {
        return this.positionOverride;
    }

    public final void a(boolean z2) {
        this.enable = z2;
        this.enableOverride = true;
    }

    public final void a(AdInformationPositions.Position position) {
        this.position = position;
        if (position != null) {
            this.positionOverride = true;
        } else {
            this.positionOverride = false;
        }
    }
}
