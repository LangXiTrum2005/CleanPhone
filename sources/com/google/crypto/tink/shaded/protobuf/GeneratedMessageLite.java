package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.attabal;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class GeneratedMessageLite<MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends attabal<MessageType, BuilderType>> extends com.google.crypto.tink.shaded.protobuf.attabal<MessageType, BuilderType> {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Class<?>, GeneratedMessageLite<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize = -1;
    protected nosophobia unknownFields = nosophobia.dern();

    public enum MethodToInvoke {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    public static abstract class attabal<MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends attabal<MessageType, BuilderType>> extends com.google.crypto.tink.shaded.protobuf.attabal.AbstractC0320attabal<MessageType, BuilderType> {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public MessageType f22129arytenoidectomy;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final MessageType f22130kowloon;

        public attabal(MessageType messagetype) {
            this.f22130kowloon = messagetype;
            if (messagetype.cord()) {
                throw new IllegalArgumentException("Default instance must be immutable.");
            }
            this.f22129arytenoidectomy = (MessageType) polloi();
        }

        public static <MessageType> void monoploid(MessageType messagetype, MessageType messagetype2) {
            clubfoot.attabal().wireman(messagetype).mergeFrom(messagetype, messagetype2);
        }

        private MessageType polloi() {
            return (MessageType) this.f22130kowloon.sealless();
        }

        public void apical() {
            MessageType messagetype = (MessageType) polloi();
            monoploid(messagetype, this.f22129arytenoidectomy);
            this.f22129arytenoidectomy = messagetype;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.privatdozent.attabal
        /* JADX INFO: renamed from: beachfront, reason: merged with bridge method [inline-methods] */
        public final MessageType build() {
            MessageType messagetype = (MessageType) buildPartial();
            if (messagetype.isInitialized()) {
                return messagetype;
            }
            throw com.google.crypto.tink.shaded.protobuf.attabal.AbstractC0320attabal.marial(messagetype);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.privatdozent.attabal
        /* JADX INFO: renamed from: competently, reason: merged with bridge method [inline-methods] */
        public MessageType buildPartial() {
            if (!this.f22129arytenoidectomy.cord()) {
                return this.f22129arytenoidectomy;
            }
            this.f22129arytenoidectomy.cuirassed();
            return this.f22129arytenoidectomy;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.creditor
        /* JADX INFO: renamed from: formularize, reason: merged with bridge method [inline-methods] */
        public MessageType getDefaultInstanceForType() {
            return this.f22130kowloon;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.attabal.AbstractC0320attabal
        /* JADX INFO: renamed from: impassible, reason: merged with bridge method [inline-methods] */
        public BuilderType dern(MessageType messagetype) {
            return (BuilderType) kowloon(messagetype);
        }

        @Override // 
        /* JADX INFO: renamed from: impromptu, reason: merged with bridge method [inline-methods] */
        public BuilderType clone() {
            BuilderType buildertype = (BuilderType) getDefaultInstanceForType().newBuilderForType();
            buildertype.f22129arytenoidectomy = (MessageType) buildPartial();
            return buildertype;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.creditor
        public final boolean isInitialized() {
            return GeneratedMessageLite.preprohormone(this.f22129arytenoidectomy, false);
        }

        public BuilderType kowloon(MessageType messagetype) {
            if (getDefaultInstanceForType().equals(messagetype)) {
                return this;
            }
            taiyuan();
            monoploid(this.f22129arytenoidectomy, messagetype);
            return this;
        }

        public final void taiyuan() {
            if (this.f22129arytenoidectomy.cord()) {
                return;
            }
            apical();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.privatdozent.attabal
        /* JADX INFO: renamed from: triweekly, reason: merged with bridge method [inline-methods] */
        public BuilderType creditor(taiyuan taiyuanVar, kowloon kowloonVar) throws IOException {
            taiyuan();
            try {
                clubfoot.attabal().wireman(this.f22129arytenoidectomy).saneness(this.f22129arytenoidectomy, cutely.impromptu(taiyuanVar), kowloonVar);
                return this;
            } catch (RuntimeException e) {
                if (e.getCause() instanceof IOException) {
                    throw ((IOException) e.getCause());
                }
                throw e;
            }
        }
    }

    public static abstract class dern<MessageType extends dern<MessageType, BuilderType>, BuilderType> extends GeneratedMessageLite<MessageType, BuilderType> implements creditor {
        protected graveside<wireman> extensions = graveside.impromptu();

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite, com.google.crypto.tink.shaded.protobuf.creditor
        public /* bridge */ /* synthetic */ privatdozent getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite, com.google.crypto.tink.shaded.protobuf.privatdozent
        public /* bridge */ /* synthetic */ privatdozent.attabal newBuilderForType() {
            return super.newBuilderForType();
        }

        public graveside<wireman> starveling() {
            if (this.extensions.triweekly()) {
                this.extensions = this.extensions.clone();
            }
            return this.extensions;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite, com.google.crypto.tink.shaded.protobuf.privatdozent
        public /* bridge */ /* synthetic */ privatdozent.attabal toBuilder() {
            return super.toBuilder();
        }
    }

    public static class marial<ContainingType extends privatdozent, Type> extends impassible<ContainingType, Type> {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final privatdozent f22131attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final wireman f22132saneness;

        public WireFormat.FieldType attabal() {
            return this.f22132saneness.getLiteType();
        }

        public int dern() {
            return this.f22132saneness.getNumber();
        }

        public privatdozent saneness() {
            return this.f22131attabal;
        }

        public boolean wireman() {
            return this.f22132saneness.f22138polloi;
        }
    }

    public static class saneness<T extends GeneratedMessageLite<T, ?>> extends com.google.crypto.tink.shaded.protobuf.saneness<T> {

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final T f22133saneness;

        public saneness(T t) {
            this.f22133saneness = t;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.overspeculate
        /* JADX INFO: renamed from: competently, reason: merged with bridge method [inline-methods] */
        public T attabal(taiyuan taiyuanVar, kowloon kowloonVar) throws InvalidProtocolBufferException {
            return (T) GeneratedMessageLite.polder(this.f22133saneness, taiyuanVar, kowloonVar);
        }
    }

    public static final class wireman implements graveside.saneness<wireman> {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public final int f22134arytenoidectomy;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final rotuma.wireman<?> f22135kowloon;

        /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
        public final boolean f22136molybdenite;

        /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
        public final WireFormat.FieldType f22137monoploid;

        /* JADX INFO: renamed from: polloi, reason: collision with root package name */
        public final boolean f22138polloi;

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
        public int compareTo(wireman wiremanVar) {
            return this.f22134arytenoidectomy - wiremanVar.f22134arytenoidectomy;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.crypto.tink.shaded.protobuf.graveside.saneness
        public privatdozent.attabal beachfront(privatdozent.attabal attabalVar, privatdozent privatdozentVar) {
            return ((attabal) attabalVar).kowloon((GeneratedMessageLite) privatdozentVar);
        }

        public rotuma.wireman<?> dern() {
            return this.f22135kowloon;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.graveside.saneness
        public WireFormat.JavaType getLiteJavaType() {
            return this.f22137monoploid.getJavaType();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.graveside.saneness
        public WireFormat.FieldType getLiteType() {
            return this.f22137monoploid;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.graveside.saneness
        public int getNumber() {
            return this.f22134arytenoidectomy;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.graveside.saneness
        public boolean isPacked() {
            return this.f22136molybdenite;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.graveside.saneness
        public boolean isRepeated() {
            return this.f22138polloi;
        }
    }

    public static <T extends GeneratedMessageLite<T, ?>> T apical(T t) throws InvalidProtocolBufferException {
        if (t == null || t.isInitialized()) {
            return t;
        }
        throw t.marial().asInvalidProtocolBufferException().setUnfinishedMessage(t);
    }

    public static <T extends GeneratedMessageLite<?, ?>> T graveside(Class<T> cls) {
        T t = (T) defaultInstanceMap.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (T) defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (t != null) {
            return t;
        }
        T t2 = (T) ((GeneratedMessageLite) sayid.allocateInstance(cls)).getDefaultInstanceForType();
        if (t2 == null) {
            throw new IllegalStateException();
        }
        defaultInstanceMap.put((Class<?>) cls, t2);
        return t2;
    }

    public static <T extends GeneratedMessageLite<?, ?>> void grimness(Class<T> cls, T t) {
        t.stratoscope();
        defaultInstanceMap.put(cls, t);
    }

    public static <T extends GeneratedMessageLite<T, ?>> T kattegat(T t, ByteString byteString, kowloon kowloonVar) throws InvalidProtocolBufferException {
        return (T) apical(merc(t, byteString, kowloonVar));
    }

    public static <T extends GeneratedMessageLite<T, ?>> T merc(T t, ByteString byteString, kowloon kowloonVar) throws InvalidProtocolBufferException {
        taiyuan taiyuanVarNewCodedInput = byteString.newCodedInput();
        T t2 = (T) polder(t, taiyuanVarNewCodedInput, kowloonVar);
        try {
            taiyuanVarNewCodedInput.attabal(0);
            return t2;
        } catch (InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(t2);
        }
    }

    public static <E> rotuma.taiyuan<E> molybdenite() {
        return dent.wireman();
    }

    public static <T extends GeneratedMessageLite<T, ?>> T polder(T t, taiyuan taiyuanVar, kowloon kowloonVar) throws InvalidProtocolBufferException {
        T t2 = (T) t.sealless();
        try {
            premeiotic premeioticVarWireman = clubfoot.attabal().wireman(t2);
            premeioticVarWireman.saneness(t2, cutely.impromptu(taiyuanVar), kowloonVar);
            premeioticVarWireman.makeImmutable(t2);
            return t2;
        } catch (InvalidProtocolBufferException e) {
            e = e;
            if (e.getThrownFromInputStream()) {
                e = new InvalidProtocolBufferException((IOException) e);
            }
            throw e.setUnfinishedMessage(t2);
        } catch (UninitializedMessageException e2) {
            throw e2.asInvalidProtocolBufferException().setUnfinishedMessage(t2);
        } catch (IOException e3) {
            if (e3.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e3.getCause());
            }
            throw new InvalidProtocolBufferException(e3).setUnfinishedMessage(t2);
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e4.getCause());
            }
            throw e4;
        }
    }

    public static final <T extends GeneratedMessageLite<T, ?>> boolean preprohormone(T t, boolean z) {
        byte bByteValue = ((Byte) t.polloi(MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zIsInitialized = clubfoot.attabal().wireman(t).isInitialized(t);
        if (z) {
            t.polloi(MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED, zIsInitialized ? t : null, null);
        }
        return zIsInitialized;
    }

    public static <T extends GeneratedMessageLite<T, ?>> T restrictive(T t, byte[] bArr, kowloon kowloonVar) throws InvalidProtocolBufferException {
        return (T) apical(seminary(t, bArr, 0, bArr.length, kowloonVar));
    }

    public static Object rotuma(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static <T extends GeneratedMessageLite<T, ?>> T seminary(T t, byte[] bArr, int i, int i2, kowloon kowloonVar) throws InvalidProtocolBufferException {
        if (i2 == 0) {
            return t;
        }
        T t2 = (T) t.sealless();
        try {
            premeiotic premeioticVarWireman = clubfoot.attabal().wireman(t2);
            premeioticVarWireman.attabal(t2, bArr, i, i + i2, new com.google.crypto.tink.shaded.protobuf.marial.saneness(kowloonVar));
            premeioticVarWireman.makeImmutable(t2);
            return t2;
        } catch (InvalidProtocolBufferException e) {
            InvalidProtocolBufferException invalidProtocolBufferException = e;
            if (invalidProtocolBufferException.getThrownFromInputStream()) {
                invalidProtocolBufferException = new InvalidProtocolBufferException((IOException) invalidProtocolBufferException);
            }
            throw invalidProtocolBufferException.setUnfinishedMessage(t2);
        } catch (UninitializedMessageException e2) {
            throw e2.asInvalidProtocolBufferException().setUnfinishedMessage(t2);
        } catch (IOException e3) {
            if (e3.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e3.getCause());
            }
            throw new InvalidProtocolBufferException(e3).setUnfinishedMessage(t2);
        } catch (IndexOutOfBoundsException unused) {
            throw InvalidProtocolBufferException.truncatedMessage().setUnfinishedMessage(t2);
        }
    }

    public static <T extends GeneratedMessageLite<T, ?>> T supplicat(T t, InputStream inputStream, kowloon kowloonVar) throws InvalidProtocolBufferException {
        return (T) apical(polder(t, taiyuan.impromptu(inputStream), kowloonVar));
    }

    public static <E> rotuma.taiyuan<E> trm(rotuma.taiyuan<E> taiyuanVar) {
        return taiyuanVar.mutableCopyWithCapacity(taiyuanVar.size() * 2);
    }

    public static Object yemenite(privatdozent privatdozentVar, String str, Object[] objArr) {
        return new permissivist(privatdozentVar, str, objArr);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.creditor
    /* JADX INFO: renamed from: adultoid, reason: merged with bridge method [inline-methods] */
    public final MessageType getDefaultInstanceForType() {
        return (MessageType) polloi(MethodToInvoke.GET_DEFAULT_INSTANCE, null, null);
    }

    public final <MessageType2 extends GeneratedMessageLite<MessageType2, BuilderType2>, BuilderType2 extends attabal<MessageType2, BuilderType2>> BuilderType2 arytenoidectomy() {
        return (BuilderType2) polloi(MethodToInvoke.NEW_BUILDER, null, null);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.privatdozent
    public void attabal(CodedOutputStream codedOutputStream) throws IOException {
        clubfoot.attabal().wireman(this).dern(this, apical.competently(codedOutputStream));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.attabal
    public void beachfront(int i) {
        if (i >= 0) {
            this.memoizedSerializedSize = (i & Integer.MAX_VALUE) | (this.memoizedSerializedSize & Integer.MIN_VALUE);
        } else {
            throw new IllegalStateException("serialized size must be non-negative, was " + i);
        }
    }

    public boolean cord() {
        return (this.memoizedSerializedSize & Integer.MIN_VALUE) != 0;
    }

    public void cuirassed() {
        clubfoot.attabal().wireman(this).makeImmutable(this);
        stratoscope();
    }

    public Object cutely() throws Exception {
        return polloi(MethodToInvoke.BUILD_MESSAGE_INFO, null, null);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.attabal
    public int dern(premeiotic premeioticVar) {
        if (!cord()) {
            if (saneness() != Integer.MAX_VALUE) {
                return saneness();
            }
            int iKowloon = kowloon(premeioticVar);
            beachfront(iKowloon);
            return iKowloon;
        }
        int iKowloon2 = kowloon(premeioticVar);
        if (iKowloon2 >= 0) {
            return iKowloon2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + iKowloon2);
    }

    public int dovishness() {
        return this.memoizedHashCode;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return clubfoot.attabal().wireman(this).equals(this, (GeneratedMessageLite) obj);
        }
        return false;
    }

    public void formularize() {
        this.memoizedHashCode = 0;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.privatdozent
    public final overspeculate<MessageType> getParserForType() {
        return (overspeculate) polloi(MethodToInvoke.GET_PARSER, null, null);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.privatdozent
    public int getSerializedSize() {
        return dern(null);
    }

    public boolean gintrap() {
        return dovishness() == 0;
    }

    public int hashCode() {
        if (cord()) {
            return triweekly();
        }
        if (gintrap()) {
            saran(triweekly());
        }
        return dovishness();
    }

    public void impassible() {
        beachfront(Integer.MAX_VALUE);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.creditor
    public final boolean isInitialized() {
        return preprohormone(this, true);
    }

    public final int kowloon(premeiotic<?> premeioticVar) {
        return premeioticVar == null ? clubfoot.attabal().wireman(this).getSerializedSize(this) : premeioticVar.getSerializedSize(this);
    }

    public final <MessageType2 extends GeneratedMessageLite<MessageType2, BuilderType2>, BuilderType2 extends attabal<MessageType2, BuilderType2>> BuilderType2 monoploid(MessageType2 messagetype2) {
        return (BuilderType2) arytenoidectomy().kowloon(messagetype2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.privatdozent
    /* JADX INFO: renamed from: oilcan, reason: merged with bridge method [inline-methods] */
    public final BuilderType newBuilderForType() {
        return (BuilderType) polloi(MethodToInvoke.NEW_BUILDER, null, null);
    }

    public abstract Object polloi(MethodToInvoke methodToInvoke, Object obj, Object obj2);

    @Override // com.google.crypto.tink.shaded.protobuf.privatdozent
    /* JADX INFO: renamed from: privatdozent, reason: merged with bridge method [inline-methods] */
    public final BuilderType toBuilder() {
        return (BuilderType) ((attabal) polloi(MethodToInvoke.NEW_BUILDER, null, null)).kowloon(this);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.attabal
    public int saneness() {
        return this.memoizedSerializedSize & Integer.MAX_VALUE;
    }

    public void saran(int i) {
        this.memoizedHashCode = i;
    }

    public MessageType sealless() {
        return (MessageType) polloi(MethodToInvoke.NEW_MUTABLE_INSTANCE, null, null);
    }

    public void stratoscope() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    public String toString() {
        return starveling.beachfront(this, super.toString());
    }

    public int triweekly() {
        return clubfoot.attabal().wireman(this).hashCode(this);
    }
}
