package kotlin.reflect.jvm.internal.impl.builtins.functions;

import com.google.android.gms.ads.RequestConfiguration;
import com.p004ironsource.m5;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.IndexedValue;
import kotlin.collections.IndexingIterable;
import kotlin.collections.IndexingIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.FunctionTypesKt;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations$Companion$EMPTY$1;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.util.OperatorNameConventions;

/* JADX INFO: loaded from: classes7.dex */
public final class FunctionInvokeDescriptor extends SimpleFunctionDescriptorImpl {

    public static final class Factory {
        public static FunctionInvokeDescriptor a(FunctionClassDescriptor functionClass, boolean z2) {
            String lowerCase;
            Intrinsics.f(functionClass, "functionClass");
            FunctionInvokeDescriptor functionInvokeDescriptor = new FunctionInvokeDescriptor(functionClass, null, CallableMemberDescriptor.Kind.X, z2);
            ReceiverParameterDescriptor receiverParameterDescriptorE0 = functionClass.E0();
            EmptyList emptyList = EmptyList.X;
            List list = functionClass.l0;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((TypeParameterDescriptor) obj).j() != Variance.IN_VARIANCE) {
                    break;
                }
                arrayList.add(obj);
            }
            IndexingIterable indexingIterableM0 = CollectionsKt.m0(arrayList);
            ArrayList arrayList2 = new ArrayList(CollectionsKt.n(indexingIterableM0, 10));
            Iterator it = indexingIterableM0.iterator();
            while (true) {
                IndexingIterator indexingIterator = (IndexingIterator) it;
                if (!indexingIterator.X.hasNext()) {
                    functionInvokeDescriptor.J0(null, receiverParameterDescriptorE0, emptyList, emptyList, arrayList2, ((TypeParameterDescriptor) CollectionsKt.F(list)).o(), Modality.e0, DescriptorVisibilities.f43564e);
                    FunctionInvokeDescriptor functionInvokeDescriptor2 = functionInvokeDescriptor;
                    functionInvokeDescriptor2.y0 = true;
                    return functionInvokeDescriptor2;
                }
                IndexedValue indexedValue = (IndexedValue) indexingIterator.next();
                int i2 = indexedValue.f43274a;
                TypeParameterDescriptor typeParameterDescriptor = (TypeParameterDescriptor) indexedValue.f43275b;
                String strB = typeParameterDescriptor.getName().b();
                Intrinsics.e(strB, "typeParameter.name.asString()");
                if (strB.equals(RequestConfiguration.MAX_AD_CONTENT_RATING_T)) {
                    lowerCase = m5.f25675p;
                } else if (strB.equals("E")) {
                    lowerCase = "receiver";
                } else {
                    lowerCase = strB.toLowerCase(Locale.ROOT);
                    Intrinsics.e(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                }
                FunctionInvokeDescriptor functionInvokeDescriptor3 = functionInvokeDescriptor;
                Annotations$Companion$EMPTY$1 annotations$Companion$EMPTY$1 = Annotations.Companion.f43614a;
                Name nameG = Name.g(lowerCase);
                SimpleType simpleTypeO = typeParameterDescriptor.o();
                Intrinsics.e(simpleTypeO, "typeParameter.defaultType");
                arrayList2.add(new ValueParameterDescriptorImpl(functionInvokeDescriptor3, null, i2, annotations$Companion$EMPTY$1, nameG, simpleTypeO, false, false, false, null, SourceElement.f43591a));
                functionInvokeDescriptor = functionInvokeDescriptor3;
            }
        }
    }

    public FunctionInvokeDescriptor(DeclarationDescriptor declarationDescriptor, FunctionInvokeDescriptor functionInvokeDescriptor, CallableMemberDescriptor.Kind kind, boolean z2) {
        super(declarationDescriptor, functionInvokeDescriptor, Annotations.Companion.f43614a, OperatorNameConventions.g, kind, SourceElement.f43591a);
        this.n0 = true;
        this.w0 = z2;
        this.x0 = false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl
    public final FunctionDescriptorImpl G0(CallableMemberDescriptor.Kind kind, DeclarationDescriptor newOwner, FunctionDescriptor functionDescriptor, SourceElement sourceElement, Annotations annotations, Name name) {
        Intrinsics.f(newOwner, "newOwner");
        Intrinsics.f(kind, "kind");
        Intrinsics.f(annotations, "annotations");
        return new FunctionInvokeDescriptor(newOwner, (FunctionInvokeDescriptor) functionDescriptor, kind, this.w0);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl
    public final FunctionDescriptorImpl H0(FunctionDescriptorImpl.CopyConfiguration configuration) {
        Name name;
        Intrinsics.f(configuration, "configuration");
        FunctionInvokeDescriptor functionInvokeDescriptor = (FunctionInvokeDescriptor) super.H0(configuration);
        if (functionInvokeDescriptor == null) {
            return null;
        }
        List listE = functionInvokeDescriptor.e();
        Intrinsics.e(listE, "substituted.valueParameters");
        List list = listE;
        if ((list instanceof Collection) && list.isEmpty()) {
            return functionInvokeDescriptor;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            KotlinType type = ((ValueParameterDescriptor) it.next()).getType();
            Intrinsics.e(type, "it.type");
            if (FunctionTypesKt.c(type) != null) {
                List listE2 = functionInvokeDescriptor.e();
                Intrinsics.e(listE2, "substituted.valueParameters");
                List list2 = listE2;
                ArrayList arrayList = new ArrayList(CollectionsKt.n(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    KotlinType type2 = ((ValueParameterDescriptor) it2.next()).getType();
                    Intrinsics.e(type2, "it.type");
                    arrayList.add(FunctionTypesKt.c(type2));
                }
                int size = functionInvokeDescriptor.e().size() - arrayList.size();
                boolean z2 = true;
                if (size == 0) {
                    List valueParameters = functionInvokeDescriptor.e();
                    Intrinsics.e(valueParameters, "valueParameters");
                    ArrayList<Pair> arrayListN0 = CollectionsKt.n0(arrayList, valueParameters);
                    if (arrayListN0.isEmpty()) {
                        return functionInvokeDescriptor;
                    }
                    for (Pair pair : arrayListN0) {
                        if (!Intrinsics.a((Name) pair.X, ((ValueParameterDescriptor) pair.f43249Y).getName())) {
                        }
                    }
                    return functionInvokeDescriptor;
                }
                List valueParameters2 = functionInvokeDescriptor.e();
                Intrinsics.e(valueParameters2, "valueParameters");
                List<ValueParameterDescriptor> list3 = valueParameters2;
                ArrayList arrayList2 = new ArrayList(CollectionsKt.n(list3, 10));
                for (ValueParameterDescriptor valueParameterDescriptor : list3) {
                    Name name2 = valueParameterDescriptor.getName();
                    Intrinsics.e(name2, "it.name");
                    int iG = valueParameterDescriptor.g();
                    int i2 = iG - size;
                    if (i2 >= 0 && (name = (Name) arrayList.get(i2)) != null) {
                        name2 = name;
                    }
                    arrayList2.add(valueParameterDescriptor.B(functionInvokeDescriptor, name2, iG));
                }
                FunctionDescriptorImpl.CopyConfiguration copyConfigurationK0 = functionInvokeDescriptor.K0(TypeSubstitutor.f44550b);
                if (arrayList.isEmpty()) {
                    z2 = false;
                } else {
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        if (((Name) it3.next()) == null) {
                        }
                    }
                    z2 = false;
                }
                copyConfigurationK0.v = Boolean.valueOf(z2);
                copyConfigurationK0.g = arrayList2;
                copyConfigurationK0.f43642e = functionInvokeDescriptor.y0();
                FunctionDescriptorImpl functionDescriptorImplH0 = super.H0(copyConfigurationK0);
                Intrinsics.c(functionDescriptorImplH0);
                return functionDescriptorImplH0;
            }
        }
        return functionInvokeDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public final boolean isExternal() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    public final boolean isInline() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    public final boolean y() {
        return false;
    }
}
