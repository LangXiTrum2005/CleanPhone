package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.bitmap_recycle.LruArrayPool;
import com.bumptech.glide.util.LruCache;
import com.bumptech.glide.util.Util;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes.dex */
final class ResourceCacheKey implements Key {
    public static final LruCache j = new LruCache(50);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LruArrayPool f12472b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Key f12473c;
    public final Key d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f12474e;
    public final int f;
    public final Class g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Options f12475h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Transformation f12476i;

    public ResourceCacheKey(LruArrayPool lruArrayPool, Key key, Key key2, int i2, int i3, Transformation transformation, Class cls, Options options) {
        this.f12472b = lruArrayPool;
        this.f12473c = key;
        this.d = key2;
        this.f12474e = i2;
        this.f = i3;
        this.f12476i = transformation;
        this.g = cls;
        this.f12475h = options;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.bumptech.glide.load.Key
    public final void b(MessageDigest messageDigest) {
        LruArrayPool lruArrayPool = this.f12472b;
        byte[] bArr = (byte[]) lruArrayPool.f();
        ByteBuffer.wrap(bArr).putInt(this.f12474e).putInt(this.f).array();
        this.d.b(messageDigest);
        this.f12473c.b(messageDigest);
        messageDigest.update(bArr);
        Transformation transformation = this.f12476i;
        if (transformation != null) {
            transformation.b(messageDigest);
        }
        this.f12475h.b(messageDigest);
        LruCache lruCache = j;
        Class cls = this.g;
        byte[] bytes = (byte[]) lruCache.b(cls);
        if (bytes == null) {
            bytes = cls.getName().getBytes(Key.f12364a);
            lruCache.e(cls, bytes);
        }
        messageDigest.update(bytes);
        lruArrayPool.i(bArr);
    }

    @Override // com.bumptech.glide.load.Key
    public final boolean equals(Object obj) {
        if (obj instanceof ResourceCacheKey) {
            ResourceCacheKey resourceCacheKey = (ResourceCacheKey) obj;
            if (this.f == resourceCacheKey.f && this.f12474e == resourceCacheKey.f12474e && Util.b(this.f12476i, resourceCacheKey.f12476i) && this.g.equals(resourceCacheKey.g) && this.f12473c.equals(resourceCacheKey.f12473c) && this.d.equals(resourceCacheKey.d) && this.f12475h.equals(resourceCacheKey.f12475h)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bumptech.glide.load.Key
    public final int hashCode() {
        int iHashCode = ((((this.d.hashCode() + (this.f12473c.hashCode() * 31)) * 31) + this.f12474e) * 31) + this.f;
        Transformation transformation = this.f12476i;
        if (transformation != null) {
            iHashCode = (iHashCode * 31) + transformation.hashCode();
        }
        return this.f12475h.f12369b.hashCode() + ((this.g.hashCode() + (iHashCode * 31)) * 31);
    }

    public final String toString() {
        return "ResourceCacheKey{sourceKey=" + this.f12473c + ", signature=" + this.d + ", width=" + this.f12474e + ", height=" + this.f + ", decodedResourceClass=" + this.g + ", transformation='" + this.f12476i + "', options=" + this.f12475h + AbstractJsonLexerKt.END_OBJ;
    }
}
