package p002kotlin.reflect.jvm.internal;

import androidx.core.app.NotificationCompat;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import frenchy.saneness;
import gibeonite.attabal;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kurbash.arytenoidectomy;
import kurbash.dern;
import kurbash.monoploid;
import p002kotlin.LazyThreadSafetyMode;
import p002kotlin.Metadata;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.collections.adultoid;
import p002kotlin.collections.dovishness;
import p002kotlin.collections.polloi;
import p002kotlin.collections.preprohormone;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.KParameter;
import p002kotlin.reflect.KVisibility;
import p002kotlin.reflect.full.IllegalCallableAccessException;
import p002kotlin.reflect.jvm.internal.calls.impromptu;
import p002kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import p002kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import p002kotlin.reflect.jvm.internal.impl.descriptors.clubfoot;
import p002kotlin.reflect.jvm.internal.impl.descriptors.cultivated;
import p002kotlin.reflect.jvm.internal.impl.descriptors.molybdenite;
import p002kotlin.reflect.jvm.internal.impl.descriptors.polder;
import p002kotlin.reflect.jvm.internal.impl.descriptors.starveling;
import p002kotlin.reflect.jvm.internal.impl.types.coffeecake;
import p002kotlin.reflect.jvm.internal.impl.types.oilcan;
import patroclinal.taiyuan;

/* JADX INFO: compiled from: KCallableImpl.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\t\u001a\u00028\u00002\u0016\u0010\b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00070\u0006\"\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ%\u0010\r\u001a\u00028\u00002\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ3\u0010\u0011\u001a\u00028\u00002\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000b2\f\u0010\u0010\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000fH\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u0019\u001a\u00028\u00002\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000bH\u0002¢\u0006\u0004\b\u0019\u0010\u000eJ\u0017\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0011\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0002¢\u0006\u0004\b\u001f\u0010 R.\u0010'\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020# $*\n\u0012\u0004\u0012\u00020#\u0018\u00010\"0\"0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&RD\u0010+\u001a2\u0012.\u0012,\u0012\u0004\u0012\u00020\f $*\u0016\u0012\u0004\u0012\u00020\f\u0018\u00010(j\n\u0012\u0004\u0012\u00020\f\u0018\u0001`)0(j\b\u0012\u0004\u0012\u00020\f`)0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010&R\"\u0010-\u001a\u0010\u0012\f\u0012\n $*\u0004\u0018\u00010,0,0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010&R.\u0010/\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020. $*\n\u0012\u0004\u0012\u00020.\u0018\u00010\"0\"0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010&R2\u00100\u001a \u0012\u001c\u0012\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0007 $*\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00060\u00060!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010&R\u001a\u00104\u001a\b\u0012\u0004\u0012\u000202018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u00103R\u0018\u00108\u001a\u0006\u0012\u0002\b\u0003058&X¦\u0004¢\u0006\u0006\u001a\u0004\b6\u00107R\u001a\u0010:\u001a\b\u0012\u0002\b\u0003\u0018\u0001058&X¦\u0004¢\u0006\u0006\u001a\u0004\b9\u00107R\u0014\u0010>\u001a\u00020;8&X¦\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=R\u0014\u0010A\u001a\u0002028&X¦\u0004¢\u0006\u0006\u001a\u0004\b?\u0010@R\u001a\u0010D\u001a\b\u0012\u0004\u0012\u00020#0\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bB\u0010CR\u001a\u0010F\u001a\b\u0012\u0004\u0012\u00020\f0\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bE\u0010CR\u0014\u0010I\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bG\u0010HR\u001a\u0010L\u001a\b\u0012\u0004\u0012\u00020J0\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bK\u0010CR\u0016\u0010P\u001a\u0004\u0018\u00010M8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bN\u0010OR\u0014\u0010Q\u001a\u0002028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010@R\u0014\u0010R\u001a\u0002028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bR\u0010@R\u0014\u0010S\u001a\u0002028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bS\u0010@R\u0014\u0010U\u001a\u0002028DX\u0084\u0004¢\u0006\u0006\u001a\u0004\bT\u0010@R\u0014\u0010Y\u001a\u00020V8&X¦\u0004¢\u0006\u0006\u001a\u0004\bW\u0010X¨\u0006Z"}, d2 = {"Lkotlin/reflect/jvm/internal/KCallableImpl;", "R", "Lkurbash/dern;", "Lkotlin/reflect/jvm/internal/formularize;", "<init>", "()V", "", "", "args", NotificationCompat.CATEGORY_CALL, "([Ljava/lang/Object;)Ljava/lang/Object;", "", "Lkotlin/reflect/KParameter;", "callBy", "(Ljava/util/Map;)Ljava/lang/Object;", "Lwretchedly/dern;", "continuationArgument", "polloi", "(Ljava/util/Map;Lwretchedly/dern;)Ljava/lang/Object;", "adultoid", "()[Ljava/lang/Object;", MediationConfiguration.CUSTOM_EVENT_SERVER_PARAMETER_FIELD, "", "cord", "(Lkotlin/reflect/KParameter;)I", "monoploid", "Lkurbash/arytenoidectomy;", "type", "molybdenite", "(Lkurbash/arytenoidectomy;)Ljava/lang/Object;", "Ljava/lang/reflect/Type;", "graveside", "()Ljava/lang/reflect/Type;", "Lkotlin/reflect/jvm/internal/triweekly$attabal;", "", "", "kotlin.jvm.PlatformType", "kowloon", "Lkotlin/reflect/jvm/internal/triweekly$attabal;", "_annotations", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "arytenoidectomy", "_parameters", "Lkotlin/reflect/jvm/internal/KTypeImpl;", "_returnType", "Lkotlin/reflect/jvm/internal/KTypeParameterImpl;", "_typeParameters", "_absentArguments", "Lpatroclinal/taiyuan;", "", "Lpatroclinal/taiyuan;", "parametersNeedMFVCFlattening", "Lkotlin/reflect/jvm/internal/calls/dern;", "dovishness", "()Lkotlin/reflect/jvm/internal/calls/dern;", "caller", "rotuma", "defaultCaller", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "gintrap", "()Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "container", "stratoscope", "()Z", "isBound", "getAnnotations", "()Ljava/util/List;", "annotations", "getParameters", "parameters", "getReturnType", "()Lkurbash/arytenoidectomy;", "returnType", "Lkurbash/monoploid;", "getTypeParameters", "typeParameters", "Lkotlin/reflect/KVisibility;", "getVisibility", "()Lkotlin/reflect/KVisibility;", "visibility", "isFinal", "isOpen", "isAbstract", "cuirassed", "isAnnotationConstructor", "Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/CallableMemberDescriptor;", "descriptor", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class KCallableImpl<R> implements dern<R>, formularize {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    public final triweekly.attabal<ArrayList<KParameter>> _parameters;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name and from kotlin metadata */
    public final taiyuan<Boolean> parametersNeedMFVCFlattening;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public final triweekly.attabal<List<Annotation>> _annotations;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name and from kotlin metadata */
    public final triweekly.attabal<Object[]> _absentArguments;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
    public final triweekly.attabal<KTypeImpl> _returnType;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name and from kotlin metadata */
    public final triweekly.attabal<List<KTypeParameterImpl>> _typeParameters;

    public KCallableImpl() {
        triweekly.attabal<List<Annotation>> attabalVarDern = triweekly.dern(new Function0<List<? extends Annotation>>(this) { // from class: kotlin.reflect.jvm.internal.KCallableImpl$_annotations$1
            final /* synthetic */ KCallableImpl<R> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // p002kotlin.jvm.functions.Function0
            public final List<? extends Annotation> invoke() {
                return molybdenite.marial(this.this$0.trm());
            }
        });
        Intrinsics.checkNotNullExpressionValue(attabalVarDern, "lazySoft(...)");
        this._annotations = attabalVarDern;
        triweekly.attabal<ArrayList<KParameter>> attabalVarDern2 = triweekly.dern(new Function0<ArrayList<KParameter>>(this) { // from class: kotlin.reflect.jvm.internal.KCallableImpl$_parameters$1
            final /* synthetic */ KCallableImpl<R> this$0;

            /* JADX INFO: compiled from: Comparisons.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "kotlin.jvm.PlatformType", "a", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            public static final class attabal<T> implements Comparator {
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return saneness.wireman(((KParameter) t).getName(), ((KParameter) t2).getName());
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // p002kotlin.jvm.functions.Function0
            public final ArrayList<KParameter> invoke() {
                int i;
                final CallableMemberDescriptor callableMemberDescriptorTrm = this.this$0.trm();
                ArrayList<KParameter> arrayList = new ArrayList<>();
                final int i2 = 0;
                if (this.this$0.stratoscope()) {
                    i = 0;
                } else {
                    final starveling starvelingVarTaiyuan = molybdenite.taiyuan(callableMemberDescriptorTrm);
                    if (starvelingVarTaiyuan != null) {
                        arrayList.add(new KParameterImpl(this.this$0, 0, KParameter.Kind.INSTANCE, new Function0<polder>() { // from class: kotlin.reflect.jvm.internal.KCallableImpl$_parameters$1.1
                            {
                                super(0);
                            }

                            @Override // p002kotlin.jvm.functions.Function0
                            public final polder invoke() {
                                return starvelingVarTaiyuan;
                            }
                        }));
                        i = 1;
                    } else {
                        i = 0;
                    }
                    final starveling starvelingVarPolder = callableMemberDescriptorTrm.polder();
                    if (starvelingVarPolder != null) {
                        arrayList.add(new KParameterImpl(this.this$0, i, KParameter.Kind.EXTENSION_RECEIVER, new Function0<polder>() { // from class: kotlin.reflect.jvm.internal.KCallableImpl$_parameters$1.2
                            {
                                super(0);
                            }

                            @Override // p002kotlin.jvm.functions.Function0
                            public final polder invoke() {
                                return starvelingVarPolder;
                            }
                        }));
                        i++;
                    }
                }
                int size = callableMemberDescriptorTrm.beachfront().size();
                while (i2 < size) {
                    arrayList.add(new KParameterImpl(this.this$0, i, KParameter.Kind.VALUE, new Function0<polder>() { // from class: kotlin.reflect.jvm.internal.KCallableImpl$_parameters$1.3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // p002kotlin.jvm.functions.Function0
                        public final polder invoke() {
                            cultivated cultivatedVar = callableMemberDescriptorTrm.beachfront().get(i2);
                            Intrinsics.checkNotNullExpressionValue(cultivatedVar, "get(...)");
                            return cultivatedVar;
                        }
                    }));
                    i2++;
                    i++;
                }
                if (this.this$0.cuirassed() && (callableMemberDescriptorTrm instanceof methylmercury.attabal) && arrayList.size() > 1) {
                    preprohormone.cuirassed(arrayList, new attabal());
                }
                arrayList.trimToSize();
                return arrayList;
            }
        });
        Intrinsics.checkNotNullExpressionValue(attabalVarDern2, "lazySoft(...)");
        this._parameters = attabalVarDern2;
        triweekly.attabal<KTypeImpl> attabalVarDern3 = triweekly.dern(new Function0<KTypeImpl>(this) { // from class: kotlin.reflect.jvm.internal.KCallableImpl$_returnType$1
            final /* synthetic */ KCallableImpl<R> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // p002kotlin.jvm.functions.Function0
            public final KTypeImpl invoke() {
                oilcan returnType = this.this$0.trm().getReturnType();
                Intrinsics.beachfront(returnType);
                final KCallableImpl<R> kCallableImpl = this.this$0;
                return new KTypeImpl(returnType, new Function0<Type>() { // from class: kotlin.reflect.jvm.internal.KCallableImpl$_returnType$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(0);
                    }

                    @Override // p002kotlin.jvm.functions.Function0
                    public final Type invoke() {
                        Type typeGraveside = kCallableImpl.graveside();
                        return typeGraveside == null ? kCallableImpl.dovishness().getReturnType() : typeGraveside;
                    }
                });
            }
        });
        Intrinsics.checkNotNullExpressionValue(attabalVarDern3, "lazySoft(...)");
        this._returnType = attabalVarDern3;
        triweekly.attabal<List<KTypeParameterImpl>> attabalVarDern4 = triweekly.dern(new Function0<List<? extends KTypeParameterImpl>>(this) { // from class: kotlin.reflect.jvm.internal.KCallableImpl$_typeParameters$1
            final /* synthetic */ KCallableImpl<R> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // p002kotlin.jvm.functions.Function0
            public final List<? extends KTypeParameterImpl> invoke() {
                List<clubfoot> typeParameters = this.this$0.trm().getTypeParameters();
                Intrinsics.checkNotNullExpressionValue(typeParameters, "getTypeParameters(...)");
                List<clubfoot> list = typeParameters;
                formularize formularizeVar = this.this$0;
                ArrayList arrayList = new ArrayList(dovishness.gintrap(list, 10));
                for (clubfoot clubfootVar : list) {
                    Intrinsics.beachfront(clubfootVar);
                    arrayList.add(new KTypeParameterImpl(formularizeVar, clubfootVar));
                }
                return arrayList;
            }
        });
        Intrinsics.checkNotNullExpressionValue(attabalVarDern4, "lazySoft(...)");
        this._typeParameters = attabalVarDern4;
        triweekly.attabal<Object[]> attabalVarDern5 = triweekly.dern(new Function0<Object[]>(this) { // from class: kotlin.reflect.jvm.internal.KCallableImpl$_absentArguments$1
            final /* synthetic */ KCallableImpl<R> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // p002kotlin.jvm.functions.Function0
            public final Object[] invoke() {
                int iCord;
                List<KParameter> parameters = this.this$0.getParameters();
                int size = parameters.size() + (this.this$0.isSuspend() ? 1 : 0);
                if (((Boolean) this.this$0.parametersNeedMFVCFlattening.getValue()).booleanValue()) {
                    KCallableImpl<R> kCallableImpl = this.this$0;
                    iCord = 0;
                    for (KParameter kParameter : parameters) {
                        iCord += kParameter.getKind() == KParameter.Kind.VALUE ? kCallableImpl.cord(kParameter) : 0;
                    }
                } else {
                    List<KParameter> list = parameters;
                    if ((list instanceof Collection) && list.isEmpty()) {
                        iCord = 0;
                    } else {
                        Iterator<T> it = list.iterator();
                        iCord = 0;
                        while (it.hasNext()) {
                            if (((KParameter) it.next()).getKind() == KParameter.Kind.VALUE && (iCord = iCord + 1) < 0) {
                                adultoid.adultoid();
                            }
                        }
                    }
                }
                int i = (iCord + 31) / 32;
                Object[] objArr = new Object[size + i + 1];
                KCallableImpl<R> kCallableImpl2 = this.this$0;
                for (KParameter kParameter2 : parameters) {
                    if (kParameter2.formularize() && !molybdenite.formularize(kParameter2.getType())) {
                        objArr[kParameter2.getIndex()] = molybdenite.competently(emmesh.dern.beachfront(kParameter2.getType()));
                    } else if (kParameter2.saneness()) {
                        objArr[kParameter2.getIndex()] = kCallableImpl2.molybdenite(kParameter2.getType());
                    }
                }
                for (int i2 = 0; i2 < i; i2++) {
                    objArr[size + i2] = 0;
                }
                return objArr;
            }
        });
        Intrinsics.checkNotNullExpressionValue(attabalVarDern5, "lazySoft(...)");
        this._absentArguments = attabalVarDern5;
        this.parametersNeedMFVCFlattening = p002kotlin.saneness.attabal(LazyThreadSafetyMode.PUBLICATION, new Function0<Boolean>(this) { // from class: kotlin.reflect.jvm.internal.KCallableImpl$parametersNeedMFVCFlattening$1
            final /* synthetic */ KCallableImpl<R> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
                this.this$0 = this;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p002kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                List<KParameter> parameters = this.this$0.getParameters();
                boolean z = false;
                if (!(parameters instanceof Collection) || !parameters.isEmpty()) {
                    Iterator<T> it = parameters.iterator();
                    while (it.hasNext()) {
                        if (molybdenite.apical(((KParameter) it.next()).getType())) {
                            z = true;
                            break;
                        }
                    }
                }
                return Boolean.valueOf(z);
            }
        });
    }

    public final Object[] adultoid() {
        return (Object[]) this._absentArguments.invoke().clone();
    }

    @Override // kurbash.dern
    public R call(Object... args) throws IllegalCallableAccessException {
        Intrinsics.checkNotNullParameter(args, "args");
        try {
            return (R) dovishness().call(args);
        } catch (IllegalAccessException e) {
            throw new IllegalCallableAccessException(e);
        }
    }

    @Override // kurbash.dern
    public R callBy(Map<KParameter, ? extends Object> args) {
        Intrinsics.checkNotNullParameter(args, "args");
        return cuirassed() ? monoploid(args) : polloi(args, null);
    }

    public final int cord(KParameter parameter) {
        if (!this.parametersNeedMFVCFlattening.getValue().booleanValue()) {
            throw new IllegalArgumentException("Check if parametersNeedMFVCFlattening is true before");
        }
        if (!molybdenite.apical(parameter.getType())) {
            return 1;
        }
        arytenoidectomy type = parameter.getType();
        Intrinsics.competently(type, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KTypeImpl");
        List<Method> listImpassible = impromptu.impassible(coffeecake.attabal(((KTypeImpl) type).getType()));
        Intrinsics.beachfront(listImpassible);
        return listImpassible.size();
    }

    public final boolean cuirassed() {
        return Intrinsics.wireman(getName(), "<init>") && getContainer().competently().isAnnotation();
    }

    public abstract p002kotlin.reflect.jvm.internal.calls.dern<?> dovishness();

    @Override // kurbash.saneness
    public List<Annotation> getAnnotations() {
        List<Annotation> listInvoke = this._annotations.invoke();
        Intrinsics.checkNotNullExpressionValue(listInvoke, "invoke(...)");
        return listInvoke;
    }

    @Override // kurbash.dern
    public List<KParameter> getParameters() {
        ArrayList<KParameter> arrayListInvoke = this._parameters.invoke();
        Intrinsics.checkNotNullExpressionValue(arrayListInvoke, "invoke(...)");
        return arrayListInvoke;
    }

    @Override // kurbash.dern
    public arytenoidectomy getReturnType() {
        KTypeImpl kTypeImplInvoke = this._returnType.invoke();
        Intrinsics.checkNotNullExpressionValue(kTypeImplInvoke, "invoke(...)");
        return kTypeImplInvoke;
    }

    @Override // kurbash.dern
    public List<monoploid> getTypeParameters() {
        List<KTypeParameterImpl> listInvoke = this._typeParameters.invoke();
        Intrinsics.checkNotNullExpressionValue(listInvoke, "invoke(...)");
        return listInvoke;
    }

    @Override // kurbash.dern
    public KVisibility getVisibility() {
        molybdenite visibility = trm().getVisibility();
        Intrinsics.checkNotNullExpressionValue(visibility, "getVisibility(...)");
        return molybdenite.polloi(visibility);
    }

    /* JADX INFO: renamed from: gintrap */
    public abstract KDeclarationContainerImpl getContainer();

    public final Type graveside() {
        Type[] lowerBounds;
        if (isSuspend()) {
            Object objPicketboat = CollectionsKt.picketboat(dovishness().attabal());
            ParameterizedType parameterizedType = objPicketboat instanceof ParameterizedType ? (ParameterizedType) objPicketboat : null;
            if (Intrinsics.wireman(parameterizedType != null ? parameterizedType.getRawType() : null, wretchedly.dern.class)) {
                Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                Intrinsics.checkNotNullExpressionValue(actualTypeArguments, "getActualTypeArguments(...)");
                Object objCzestochowa = polloi.czestochowa(actualTypeArguments);
                WildcardType wildcardType = objCzestochowa instanceof WildcardType ? (WildcardType) objCzestochowa : null;
                if (wildcardType != null && (lowerBounds = wildcardType.getLowerBounds()) != null) {
                    return (Type) polloi.creditor(lowerBounds);
                }
            }
        }
        return null;
    }

    @Override // kurbash.dern
    public boolean isAbstract() {
        return trm().kowloon() == Modality.ABSTRACT;
    }

    @Override // kurbash.dern
    public boolean isFinal() {
        return trm().kowloon() == Modality.FINAL;
    }

    @Override // kurbash.dern
    public boolean isOpen() {
        return trm().kowloon() == Modality.OPEN;
    }

    public final Object molybdenite(arytenoidectomy type) {
        Class clsSaneness = attabal.saneness(emmesh.saneness.saneness(type));
        if (clsSaneness.isArray()) {
            Object objNewInstance = Array.newInstance(clsSaneness.getComponentType(), 0);
            Intrinsics.checkNotNullExpressionValue(objNewInstance, "run(...)");
            return objNewInstance;
        }
        throw new KotlinReflectionInternalError("Cannot instantiate the default empty array of type " + clsSaneness.getSimpleName() + ", because it is not an array type");
    }

    public final R monoploid(Map<KParameter, ? extends Object> args) throws IllegalCallableAccessException {
        Object objMolybdenite;
        List<KParameter> parameters = getParameters();
        ArrayList arrayList = new ArrayList(dovishness.gintrap(parameters, 10));
        for (KParameter kParameter : parameters) {
            if (args.containsKey(kParameter)) {
                objMolybdenite = args.get(kParameter);
                if (objMolybdenite == null) {
                    throw new IllegalArgumentException("Annotation argument value cannot be null (" + kParameter + ')');
                }
            } else if (kParameter.formularize()) {
                objMolybdenite = null;
            } else {
                if (!kParameter.saneness()) {
                    throw new IllegalArgumentException("No argument provided for a required parameter: " + kParameter);
                }
                objMolybdenite = molybdenite(kParameter.getType());
            }
            arrayList.add(objMolybdenite);
        }
        p002kotlin.reflect.jvm.internal.calls.dern<?> dernVarRotuma = rotuma();
        if (dernVarRotuma != null) {
            try {
                return (R) dernVarRotuma.call(arrayList.toArray(new Object[0]));
            } catch (IllegalAccessException e) {
                throw new IllegalCallableAccessException(e);
            }
        }
        throw new KotlinReflectionInternalError("This callable does not support a default call: " + trm());
    }

    public final R polloi(Map<KParameter, ? extends Object> args, wretchedly.dern<?> continuationArgument) throws IllegalCallableAccessException {
        Intrinsics.checkNotNullParameter(args, "args");
        List<KParameter> parameters = getParameters();
        boolean z = false;
        if (parameters.isEmpty()) {
            try {
                return (R) dovishness().call(isSuspend() ? new wretchedly.dern[]{continuationArgument} : new wretchedly.dern[0]);
            } catch (IllegalAccessException e) {
                throw new IllegalCallableAccessException(e);
            }
        }
        int size = parameters.size() + (isSuspend() ? 1 : 0);
        Object[] objArrAdultoid = adultoid();
        if (isSuspend()) {
            objArrAdultoid[parameters.size()] = continuationArgument;
        }
        boolean zBooleanValue = this.parametersNeedMFVCFlattening.getValue().booleanValue();
        int i = 0;
        for (KParameter kParameter : parameters) {
            int iCord = zBooleanValue ? cord(kParameter) : 1;
            if (args.containsKey(kParameter)) {
                objArrAdultoid[kParameter.getIndex()] = args.get(kParameter);
            } else if (kParameter.formularize()) {
                if (zBooleanValue) {
                    int i2 = i + iCord;
                    for (int i3 = i; i3 < i2; i3++) {
                        int i4 = (i3 / 32) + size;
                        Object obj = objArrAdultoid[i4];
                        Intrinsics.competently(obj, "null cannot be cast to non-null type kotlin.Int");
                        objArrAdultoid[i4] = Integer.valueOf(((Integer) obj).intValue() | (1 << (i3 % 32)));
                    }
                } else {
                    int i5 = (i / 32) + size;
                    Object obj2 = objArrAdultoid[i5];
                    Intrinsics.competently(obj2, "null cannot be cast to non-null type kotlin.Int");
                    objArrAdultoid[i5] = Integer.valueOf(((Integer) obj2).intValue() | (1 << (i % 32)));
                }
                z = true;
            } else if (!kParameter.saneness()) {
                throw new IllegalArgumentException("No argument provided for a required parameter: " + kParameter);
            }
            if (kParameter.getKind() == KParameter.Kind.VALUE) {
                i += iCord;
            }
        }
        if (!z) {
            try {
                p002kotlin.reflect.jvm.internal.calls.dern<?> dernVarDovishness = dovishness();
                Object[] objArrCopyOf = Arrays.copyOf(objArrAdultoid, size);
                Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
                return (R) dernVarDovishness.call(objArrCopyOf);
            } catch (IllegalAccessException e2) {
                throw new IllegalCallableAccessException(e2);
            }
        }
        p002kotlin.reflect.jvm.internal.calls.dern<?> dernVarRotuma = rotuma();
        if (dernVarRotuma != null) {
            try {
                return (R) dernVarRotuma.call(objArrAdultoid);
            } catch (IllegalAccessException e3) {
                throw new IllegalCallableAccessException(e3);
            }
        }
        throw new KotlinReflectionInternalError("This callable does not support a default call: " + trm());
    }

    /* JADX INFO: renamed from: preprohormone */
    public abstract CallableMemberDescriptor trm();

    public abstract p002kotlin.reflect.jvm.internal.calls.dern<?> rotuma();

    public abstract boolean stratoscope();
}
