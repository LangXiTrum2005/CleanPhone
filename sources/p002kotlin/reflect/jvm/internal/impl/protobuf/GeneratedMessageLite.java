package p002kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public abstract class GeneratedMessageLite extends p002kotlin.reflect.jvm.internal.impl.protobuf.attabal implements Serializable {

    public static /* synthetic */ class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final /* synthetic */ int[] f31079attabal;

        static {
            int[] iArr = new int[WireFormat.JavaType.values().length];
            f31079attabal = iArr;
            try {
                iArr[WireFormat.JavaType.MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31079attabal[WireFormat.JavaType.ENUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static abstract class dern<MessageType extends ExtendableMessage<MessageType>, BuilderType extends dern<MessageType, BuilderType>> extends saneness<MessageType, BuilderType> implements kowloon {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public competently<wireman> f31080arytenoidectomy = competently.competently();

        /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
        public boolean f31081monoploid;

        public final void apical() {
            if (this.f31081monoploid) {
                return;
            }
            this.f31080arytenoidectomy = this.f31080arytenoidectomy.clone();
            this.f31081monoploid = true;
        }

        public final void formularize(MessageType messagetype) {
            apical();
            this.f31080arytenoidectomy.polloi(((ExtendableMessage) messagetype).extensions);
        }

        public final competently<wireman> taiyuan() {
            this.f31080arytenoidectomy.monoploid();
            this.f31081monoploid = false;
            return this.f31080arytenoidectomy;
        }
    }

    public static class marial<ContainingType extends triweekly, Type> {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final ContainingType f31082attabal;

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public final Method f31083beachfront;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final triweekly f31084dern;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public final Class f31085marial;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final Type f31086saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public final wireman f31087wireman;

        public marial(ContainingType containingtype, Type type, triweekly triweeklyVar, wireman wiremanVar, Class cls) {
            if (containingtype == null) {
                throw new IllegalArgumentException("Null containingTypeDefaultInstance");
            }
            if (wiremanVar.getLiteType() == WireFormat.FieldType.MESSAGE && triweeklyVar == null) {
                throw new IllegalArgumentException("Null messageDefaultInstance");
            }
            this.f31082attabal = containingtype;
            this.f31086saneness = type;
            this.f31084dern = triweeklyVar;
            this.f31087wireman = wiremanVar;
            this.f31085marial = cls;
            if (impromptu.attabal.class.isAssignableFrom(cls)) {
                this.f31083beachfront = GeneratedMessageLite.getMethodOrDie(cls, "valueOf", Integer.TYPE);
            } else {
                this.f31083beachfront = null;
            }
        }

        public Object attabal(Object obj) {
            if (!this.f31087wireman.isRepeated()) {
                return marial(obj);
            }
            if (this.f31087wireman.getLiteJavaType() != WireFormat.JavaType.ENUM) {
                return obj;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                arrayList.add(marial(it.next()));
            }
            return arrayList;
        }

        public Object beachfront(Object obj) {
            return this.f31087wireman.getLiteJavaType() == WireFormat.JavaType.ENUM ? Integer.valueOf(((impromptu.attabal) obj).getNumber()) : obj;
        }

        public triweekly dern() {
            return this.f31084dern;
        }

        public Object marial(Object obj) {
            return this.f31087wireman.getLiteJavaType() == WireFormat.JavaType.ENUM ? GeneratedMessageLite.invokeOrDie(this.f31083beachfront, null, (Integer) obj) : obj;
        }

        public ContainingType saneness() {
            return this.f31082attabal;
        }

        public int wireman() {
            return this.f31087wireman.getNumber();
        }
    }

    public static abstract class saneness<MessageType extends GeneratedMessageLite, BuilderType extends saneness> extends p002kotlin.reflect.jvm.internal.impl.protobuf.attabal.AbstractC0693attabal<BuilderType> {

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public p002kotlin.reflect.jvm.internal.impl.protobuf.wireman f31088kowloon = p002kotlin.reflect.jvm.internal.impl.protobuf.wireman.f31186kowloon;

        public abstract BuilderType beachfront(MessageType messagetype);

        public final BuilderType competently(p002kotlin.reflect.jvm.internal.impl.protobuf.wireman wiremanVar) {
            this.f31088kowloon = wiremanVar;
            return this;
        }

        public final p002kotlin.reflect.jvm.internal.impl.protobuf.wireman marial() {
            return this.f31088kowloon;
        }

        @Override // 
        public BuilderType wireman() {
            throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
        }
    }

    public static final class wireman implements competently.saneness<wireman> {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public final int f31089arytenoidectomy;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final impromptu.saneness<?> f31090kowloon;

        /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
        public final boolean f31091molybdenite;

        /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
        public final WireFormat.FieldType f31092monoploid;

        /* JADX INFO: renamed from: polloi, reason: collision with root package name */
        public final boolean f31093polloi;

        public wireman(impromptu.saneness<?> sanenessVar, int i, WireFormat.FieldType fieldType, boolean z, boolean z2) {
            this.f31090kowloon = sanenessVar;
            this.f31089arytenoidectomy = i;
            this.f31092monoploid = fieldType;
            this.f31093polloi = z;
            this.f31091molybdenite = z2;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
        public int compareTo(wireman wiremanVar) {
            return this.f31089arytenoidectomy - wiremanVar.f31089arytenoidectomy;
        }

        public impromptu.saneness<?> dern() {
            return this.f31090kowloon;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.competently.saneness
        public WireFormat.JavaType getLiteJavaType() {
            return this.f31092monoploid.getJavaType();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.competently.saneness
        public WireFormat.FieldType getLiteType() {
            return this.f31092monoploid;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.competently.saneness
        public int getNumber() {
            return this.f31089arytenoidectomy;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.competently.saneness
        public triweekly.attabal impromptu(triweekly.attabal attabalVar, triweekly triweeklyVar) {
            return ((saneness) attabalVar).beachfront((GeneratedMessageLite) triweeklyVar);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.competently.saneness
        public boolean isPacked() {
            return this.f31091molybdenite;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.competently.saneness
        public boolean isRepeated() {
            return this.f31093polloi;
        }
    }

    public GeneratedMessageLite() {
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0010  */
    public static <MessageType extends triweekly> boolean attabal(competently<wireman> competentlyVar, MessageType messagetype, p002kotlin.reflect.jvm.internal.impl.protobuf.marial marialVar, CodedOutputStream codedOutputStream, beachfront beachfrontVar, int i) throws IOException {
        boolean z;
        boolean z2;
        Object objBuild;
        triweekly triweeklyVar;
        int iSaneness = WireFormat.saneness(i);
        marial marialVarSaneness = beachfrontVar.saneness(messagetype, WireFormat.attabal(i));
        if (marialVarSaneness == null) {
            z2 = true;
            z = false;
        } else if (iSaneness == competently.formularize(marialVarSaneness.f31087wireman.getLiteType(), false)) {
            z2 = false;
            z = false;
        } else {
            wireman wiremanVar = marialVarSaneness.f31087wireman;
            if (wiremanVar.f31093polloi && wiremanVar.f31092monoploid.isPackable() && iSaneness == competently.formularize(marialVarSaneness.f31087wireman.getLiteType(), true)) {
                z = true;
                z2 = false;
            } else {
                z2 = true;
                z = false;
            }
        }
        if (z2) {
            return marialVar.creditor(i, codedOutputStream);
        }
        if (z) {
            int iCutely = marialVar.cutely(marialVar.cuirassed());
            if (marialVarSaneness.f31087wireman.getLiteType() == WireFormat.FieldType.ENUM) {
                while (marialVar.marial() > 0) {
                    impromptu.attabal attabalVarFindValueByNumber = marialVarSaneness.f31087wireman.dern().findValueByNumber(marialVar.triweekly());
                    if (attabalVarFindValueByNumber == null) {
                        return true;
                    }
                    competentlyVar.attabal(marialVarSaneness.f31087wireman, marialVarSaneness.beachfront(attabalVarFindValueByNumber));
                }
            } else {
                while (marialVar.marial() > 0) {
                    competentlyVar.attabal(marialVarSaneness.f31087wireman, competently.adultoid(marialVar, marialVarSaneness.f31087wireman.getLiteType(), false));
                }
            }
            marialVar.taiyuan(iCutely);
        } else {
            int i2 = attabal.f31079attabal[marialVarSaneness.f31087wireman.getLiteJavaType().ordinal()];
            if (i2 == 1) {
                triweekly.attabal builder = (marialVarSaneness.f31087wireman.isRepeated() || (triweeklyVar = (triweekly) competentlyVar.impromptu(marialVarSaneness.f31087wireman)) == null) ? null : triweeklyVar.toBuilder();
                if (builder == null) {
                    builder = marialVarSaneness.dern().newBuilderForType();
                }
                if (marialVarSaneness.f31087wireman.getLiteType() == WireFormat.FieldType.GROUP) {
                    marialVar.polloi(marialVarSaneness.wireman(), builder, beachfrontVar);
                } else {
                    marialVar.dovishness(builder, beachfrontVar);
                }
                objBuild = builder.build();
            } else if (i2 != 2) {
                objBuild = competently.adultoid(marialVar, marialVarSaneness.f31087wireman.getLiteType(), false);
            } else {
                int iTriweekly = marialVar.triweekly();
                impromptu.attabal attabalVarFindValueByNumber2 = marialVarSaneness.f31087wireman.dern().findValueByNumber(iTriweekly);
                if (attabalVarFindValueByNumber2 == null) {
                    codedOutputStream.sensatory(i);
                    codedOutputStream.julian(iTriweekly);
                    return true;
                }
                objBuild = attabalVarFindValueByNumber2;
            }
            if (marialVarSaneness.f31087wireman.isRepeated()) {
                competentlyVar.attabal(marialVarSaneness.f31087wireman, marialVarSaneness.beachfront(objBuild));
            } else {
                competentlyVar.dovishness(marialVarSaneness.f31087wireman, marialVarSaneness.beachfront(objBuild));
            }
        }
        return true;
    }

    public static Method getMethodOrDie(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e) {
            String name = cls.getName();
            String strValueOf = String.valueOf(str);
            StringBuilder sb = new StringBuilder(name.length() + 45 + strValueOf.length());
            sb.append("Generated message class \"");
            sb.append(name);
            sb.append("\" missing method \"");
            sb.append(strValueOf);
            sb.append("\".");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    public static Object invokeOrDie(Method method, Object obj, Object... objArr) {
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

    public static <ContainingType extends triweekly, Type> marial<ContainingType, Type> newRepeatedGeneratedExtension(ContainingType containingtype, triweekly triweeklyVar, impromptu.saneness<?> sanenessVar, int i, WireFormat.FieldType fieldType, boolean z, Class cls) {
        return new marial<>(containingtype, Collections.EMPTY_LIST, triweeklyVar, new wireman(sanenessVar, i, fieldType, true, z), cls);
    }

    public static <ContainingType extends triweekly, Type> marial<ContainingType, Type> newSingularGeneratedExtension(ContainingType containingtype, Type type, triweekly triweeklyVar, impromptu.saneness<?> sanenessVar, int i, WireFormat.FieldType fieldType, Class cls) {
        return new marial<>(containingtype, type, triweeklyVar, new wireman(sanenessVar, i, fieldType, false, false), cls);
    }

    public abstract /* synthetic */ triweekly getDefaultInstanceForType();

    @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.triweekly
    public arytenoidectomy<? extends triweekly> getParserForType() {
        throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.triweekly
    public abstract /* synthetic */ int getSerializedSize();

    @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.kowloon
    public abstract /* synthetic */ boolean isInitialized();

    @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.triweekly
    public abstract /* synthetic */ triweekly.attabal newBuilderForType();

    public boolean parseUnknownField(p002kotlin.reflect.jvm.internal.impl.protobuf.marial marialVar, CodedOutputStream codedOutputStream, beachfront beachfrontVar, int i) throws IOException {
        return marialVar.creditor(i, codedOutputStream);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.triweekly
    public abstract /* synthetic */ triweekly.attabal toBuilder();

    @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.triweekly
    public abstract /* synthetic */ void writeTo(CodedOutputStream codedOutputStream) throws IOException;

    public static abstract class ExtendableMessage<MessageType extends ExtendableMessage<MessageType>> extends GeneratedMessageLite implements kowloon {
        private final competently<wireman> extensions;

        public class attabal {

            /* JADX INFO: renamed from: attabal, reason: collision with root package name */
            public final Iterator<Map.Entry<wireman, Object>> f31075attabal;

            /* JADX INFO: renamed from: dern, reason: collision with root package name */
            public final boolean f31076dern;

            /* JADX INFO: renamed from: saneness, reason: collision with root package name */
            public Map.Entry<wireman, Object> f31077saneness;

            public /* synthetic */ attabal(ExtendableMessage extendableMessage, boolean z, attabal attabalVar) {
                this(z);
            }

            public void attabal(int i, CodedOutputStream codedOutputStream) throws IOException {
                while (true) {
                    Map.Entry<wireman, Object> entry = this.f31077saneness;
                    if (entry == null || entry.getKey().getNumber() >= i) {
                        return;
                    }
                    wireman key = this.f31077saneness.getKey();
                    if (this.f31076dern && key.getLiteJavaType() == WireFormat.JavaType.MESSAGE && !key.isRepeated()) {
                        codedOutputStream.itchy(key.getNumber(), (triweekly) this.f31077saneness.getValue());
                    } else {
                        competently.cord(key, this.f31077saneness.getValue(), codedOutputStream);
                    }
                    if (this.f31075attabal.hasNext()) {
                        this.f31077saneness = this.f31075attabal.next();
                    } else {
                        this.f31077saneness = null;
                    }
                }
            }

            public attabal(boolean z) {
                Iterator<Map.Entry<wireman, Object>> itArytenoidectomy = ExtendableMessage.this.extensions.arytenoidectomy();
                this.f31075attabal = itArytenoidectomy;
                if (itArytenoidectomy.hasNext()) {
                    this.f31077saneness = itArytenoidectomy.next();
                }
                this.f31076dern = z;
            }
        }

        public ExtendableMessage() {
            this.extensions = competently.graveside();
        }

        public boolean extensionsAreInitialized() {
            return this.extensions.triweekly();
        }

        public int extensionsSerializedSize() {
            return this.extensions.apical();
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
        public abstract /* synthetic */ triweekly getDefaultInstanceForType();

        /* JADX WARN: Multi-variable type inference failed */
        public final <Type> Type getExtension(marial<MessageType, Type> marialVar) {
            saneness(marialVar);
            Object objImpromptu = this.extensions.impromptu(marialVar.f31087wireman);
            return objImpromptu == null ? marialVar.f31086saneness : (Type) marialVar.attabal(objImpromptu);
        }

        public final <Type> int getExtensionCount(marial<MessageType, List<Type>> marialVar) {
            saneness(marialVar);
            return this.extensions.cutely(marialVar.f31087wireman);
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p002kotlin.reflect.jvm.internal.impl.protobuf.triweekly
        public abstract /* synthetic */ int getSerializedSize();

        /* JADX WARN: Multi-variable type inference failed */
        public final <Type> boolean hasExtension(marial<MessageType, Type> marialVar) {
            saneness(marialVar);
            return this.extensions.impassible(marialVar.f31087wireman);
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p002kotlin.reflect.jvm.internal.impl.protobuf.kowloon
        public abstract /* synthetic */ boolean isInitialized();

        @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
        public void makeExtensionsImmutable() {
            this.extensions.monoploid();
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p002kotlin.reflect.jvm.internal.impl.protobuf.triweekly
        public abstract /* synthetic */ triweekly.attabal newBuilderForType();

        public ExtendableMessage<MessageType>.attabal newExtensionWriter() {
            return new attabal(this, false, null);
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
        public boolean parseUnknownField(p002kotlin.reflect.jvm.internal.impl.protobuf.marial marialVar, CodedOutputStream codedOutputStream, beachfront beachfrontVar, int i) throws IOException {
            return GeneratedMessageLite.attabal(this.extensions, getDefaultInstanceForType(), marialVar, codedOutputStream, beachfrontVar, i);
        }

        public final void saneness(marial<MessageType, ?> marialVar) {
            if (marialVar.saneness() != getDefaultInstanceForType()) {
                throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
            }
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p002kotlin.reflect.jvm.internal.impl.protobuf.triweekly
        public abstract /* synthetic */ triweekly.attabal toBuilder();

        @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, p002kotlin.reflect.jvm.internal.impl.protobuf.triweekly
        public abstract /* synthetic */ void writeTo(CodedOutputStream codedOutputStream) throws IOException;

        public ExtendableMessage(dern<MessageType, ?> dernVar) {
            this.extensions = dernVar.taiyuan();
        }

        public final <Type> Type getExtension(marial<MessageType, List<Type>> marialVar, int i) {
            saneness(marialVar);
            return (Type) marialVar.marial(this.extensions.taiyuan(marialVar.f31087wireman, i));
        }
    }

    public GeneratedMessageLite(saneness sanenessVar) {
    }

    public void makeExtensionsImmutable() {
    }
}
