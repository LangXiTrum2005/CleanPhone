package com.vungle.ads.internal.util;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.unity3d.services.ads.gmascar.utils.ScarConstants;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.util.List;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SafeObjectInputStream.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\u000b\u0010\fR \u0010\u0006\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/vungle/ads/internal/util/graveside;", "Ljava/io/ObjectInputStream;", "Ljava/io/InputStream;", ScarConstants.IN_SIGNAL_KEY, "", "Ljava/lang/Class;", "allowed", "<init>", "(Ljava/io/InputStream;Ljava/util/List;)V", "Ljava/io/ObjectStreamClass;", CampaignEx.JSON_KEY_DESC, "resolveClass", "(Ljava/io/ObjectStreamClass;)Ljava/lang/Class;", "Ljava/util/List;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class graveside extends ObjectInputStream {
    private final List<Class<?>> allowed;

    /* JADX WARN: Multi-variable type inference failed */
    public graveside(InputStream inputStream, List<? extends Class<?>> list) {
        super(inputStream);
        this.allowed = list;
    }

    @Override // java.io.ObjectInputStream
    public Class<?> resolveClass(ObjectStreamClass desc) throws ClassNotFoundException, IOException {
        Intrinsics.checkNotNullParameter(desc, "desc");
        Class<?> c = super.resolveClass(desc);
        if (this.allowed == null || Number.class.isAssignableFrom(c) || Intrinsics.wireman(String.class, c) || Intrinsics.wireman(Boolean.class, c) || c.isArray() || this.allowed.contains(c)) {
            Intrinsics.checkNotNullExpressionValue(c, "c");
            return c;
        }
        throw new IOException("Deserialization is not allowed for " + desc.getName());
    }
}
