package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class O20 extends ObjectInputStream {
    private final List<Class<?>> allowed;

    /* JADX WARN: Multi-variable type inference failed */
    public O20(InputStream inputStream, List<? extends Class<?>> list) {
        super(inputStream);
        this.allowed = list;
    }

    @Override // java.io.ObjectInputStream
    public Class<?> resolveClass(ObjectStreamClass objectStreamClass) throws ClassNotFoundException, IOException {
        AbstractC2995aW.q(objectStreamClass, CampaignEx.JSON_KEY_DESC);
        Class<?> clsResolveClass = super.resolveClass(objectStreamClass);
        if (this.allowed == null || Number.class.isAssignableFrom(clsResolveClass) || AbstractC2995aW.i(String.class, clsResolveClass) || AbstractC2995aW.i(Boolean.class, clsResolveClass) || clsResolveClass.isArray() || this.allowed.contains(clsResolveClass)) {
            AbstractC2995aW.p(clsResolveClass, com.umeng.analytics.pro.bc.aL);
            return clsResolveClass;
        }
        throw new IOException("Deserialization is not allowed for " + objectStreamClass.getName());
    }
}
