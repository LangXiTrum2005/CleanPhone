package com.google.common.hash;

import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.Immutable;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes4.dex */
@Immutable
@ElementTypesAreNonnullByDefault
final class MessageDigestHashFunction extends AbstractHashFunction implements Serializable {
    public final MessageDigest X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final int f20005Y;
    public final String Z;

    public static final class MessageDigestHasher extends AbstractByteHasher {
    }

    public static final class SerializedForm implements Serializable {
        private static final long serialVersionUID = 0;
        public final String X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final int f20006Y;
        public final String Z;

        public SerializedForm(String str, int i2, String str2) {
            this.X = str;
            this.f20006Y = i2;
            this.Z = str2;
        }

        private Object readResolve() {
            return new MessageDigestHashFunction(this.X, this.f20006Y, this.Z);
        }
    }

    public MessageDigestHashFunction(String str, int i2, String str2) {
        str2.getClass();
        this.Z = str2;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str);
            this.X = messageDigest;
            int digestLength = messageDigest.getDigestLength();
            boolean z2 = false;
            if (i2 >= 4 && i2 <= digestLength) {
                z2 = true;
            }
            Preconditions.b(i2, digestLength, "bytes (%s) must be >= 4 and < %s", z2);
            this.f20005Y = i2;
            try {
                messageDigest.clone();
            } catch (CloneNotSupportedException unused) {
            }
        } catch (NoSuchAlgorithmException e2) {
            throw new AssertionError(e2);
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public final String toString() {
        return this.Z;
    }

    public Object writeReplace() {
        return new SerializedForm(this.X.getAlgorithm(), this.f20005Y, this.Z);
    }

    public MessageDigestHashFunction(String str, String str2) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str);
            this.X = messageDigest;
            this.f20005Y = messageDigest.getDigestLength();
            this.Z = str2;
            try {
                messageDigest.clone();
            } catch (CloneNotSupportedException unused) {
            }
        } catch (NoSuchAlgorithmException e2) {
            throw new AssertionError(e2);
        }
    }
}
