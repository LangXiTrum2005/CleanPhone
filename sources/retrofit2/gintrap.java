package retrofit2;

import com.ironsource.C3460cc;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.net.URI;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: RequestFactory.java */
/* JADX INFO: loaded from: classes5.dex */
public final class gintrap {

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public final boolean f36504apical;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Method f36505attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    @Nullable
    public final okhttp3.dovishness f36506beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final boolean f36507competently;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public final triweekly<?>[] f36508cutely;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final String f36509dern;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public final boolean f36510impromptu;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    @Nullable
    public final okhttp3.molybdenite f36511marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final okhttp3.graveside f36512saneness;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public final boolean f36513taiyuan;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    @Nullable
    public final String f36514wireman;

    /* JADX INFO: compiled from: RequestFactory.java */
    public static final class attabal {

        /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
        @Nullable
        public Set<String> f36517adultoid;

        /* JADX INFO: renamed from: apical, reason: collision with root package name */
        public boolean f36518apical;

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public boolean f36519arytenoidectomy;

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final preprohormone f36520attabal;

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public boolean f36521beachfront;

        /* JADX INFO: renamed from: competently, reason: collision with root package name */
        public boolean f36522competently;

        /* JADX INFO: renamed from: cutely, reason: collision with root package name */
        public boolean f36523cutely;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final Annotation[] f36524dern;

        /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
        @Nullable
        public triweekly<?>[] f36525dovishness;

        /* JADX INFO: renamed from: formularize, reason: collision with root package name */
        public boolean f36526formularize;

        /* JADX INFO: renamed from: gintrap, reason: collision with root package name */
        public boolean f36527gintrap;

        /* JADX INFO: renamed from: graveside, reason: collision with root package name */
        @Nullable
        public okhttp3.dovishness f36528graveside;

        /* JADX INFO: renamed from: impassible, reason: collision with root package name */
        public boolean f36529impassible;

        /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
        public boolean f36530impromptu;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public boolean f36531kowloon;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public final Type[] f36532marial;

        /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
        @Nullable
        public okhttp3.molybdenite f36533molybdenite;

        /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
        public boolean f36534monoploid;

        /* JADX INFO: renamed from: polloi, reason: collision with root package name */
        @Nullable
        public String f36535polloi;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final Method f36536saneness;

        /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
        public boolean f36537taiyuan;

        /* JADX INFO: renamed from: triweekly, reason: collision with root package name */
        @Nullable
        public String f36538triweekly;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public final Annotation[][] f36539wireman;

        /* JADX INFO: renamed from: rotuma, reason: collision with root package name */
        public static final Pattern f36516rotuma = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");

        /* JADX INFO: renamed from: preprohormone, reason: collision with root package name */
        public static final Pattern f36515preprohormone = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");

        public attabal(preprohormone preprohormoneVar, Method method) {
            this.f36520attabal = preprohormoneVar;
            this.f36536saneness = method;
            this.f36524dern = method.getAnnotations();
            this.f36532marial = method.getGenericParameterTypes();
            this.f36539wireman = method.getParameterAnnotations();
        }

        public static Class<?> attabal(Class<?> cls) {
            if (Boolean.TYPE == cls) {
                return Boolean.class;
            }
            if (Byte.TYPE == cls) {
                return Byte.class;
            }
            if (Character.TYPE == cls) {
                return Character.class;
            }
            if (Double.TYPE == cls) {
                return Double.class;
            }
            if (Float.TYPE == cls) {
                return Float.class;
            }
            if (Integer.TYPE == cls) {
                return Integer.class;
            }
            if (Long.TYPE == cls) {
                return Long.class;
            }
            return Short.TYPE == cls ? Short.class : cls;
        }

        public static Set<String> impromptu(String str) {
            Matcher matcher = f36516rotuma.matcher(str);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            while (matcher.find()) {
                linkedHashSet.add(matcher.group(1));
            }
            return linkedHashSet;
        }

        @Nullable
        public final triweekly<?> beachfront(int i, Type type, @Nullable Annotation[] annotationArr, boolean z) {
            triweekly<?> triweeklyVar;
            if (annotationArr != null) {
                triweeklyVar = null;
                for (Annotation annotation : annotationArr) {
                    triweekly<?> triweeklyVarCompetently = competently(i, type, annotationArr, annotation);
                    if (triweeklyVarCompetently != null) {
                        if (triweeklyVar != null) {
                            throw trm.kowloon(this.f36536saneness, i, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                        }
                        triweeklyVar = triweeklyVarCompetently;
                    }
                }
            } else {
                triweeklyVar = null;
            }
            if (triweeklyVar != null) {
                return triweeklyVar;
            }
            if (z) {
                try {
                    if (trm.impromptu(type) == wretchedly.dern.class) {
                        this.f36527gintrap = true;
                        return null;
                    }
                } catch (NoClassDefFoundError unused) {
                }
            }
            throw trm.kowloon(this.f36536saneness, i, "No Retrofit annotation found.", new Object[0]);
        }

        @Nullable
        public final triweekly<?> competently(int i, Type type, Annotation[] annotationArr, Annotation annotation) {
            if (annotation instanceof observability.preprohormone) {
                cutely(i, type);
                if (this.f36529impassible) {
                    throw trm.kowloon(this.f36536saneness, i, "Multiple @Url method annotations found.", new Object[0]);
                }
                if (this.f36537taiyuan) {
                    throw trm.kowloon(this.f36536saneness, i, "@Path parameters may not be used with @Url.", new Object[0]);
                }
                if (this.f36523cutely) {
                    throw trm.kowloon(this.f36536saneness, i, "A @Url parameter must not come after a @Query.", new Object[0]);
                }
                if (this.f36518apical) {
                    throw trm.kowloon(this.f36536saneness, i, "A @Url parameter must not come after a @QueryName.", new Object[0]);
                }
                if (this.f36526formularize) {
                    throw trm.kowloon(this.f36536saneness, i, "A @Url parameter must not come after a @QueryMap.", new Object[0]);
                }
                if (this.f36535polloi != null) {
                    throw trm.kowloon(this.f36536saneness, i, "@Url cannot be used with @%s URL", this.f36538triweekly);
                }
                this.f36529impassible = true;
                if (type == okhttp3.graveside.class || type == String.class || type == URI.class || ((type instanceof Class) && "android.net.Uri".equals(((Class) type).getName()))) {
                    return new triweekly.arytenoidectomy(this.f36536saneness, i);
                }
                throw trm.kowloon(this.f36536saneness, i, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type.", new Object[0]);
            }
            if (annotation instanceof observability.molybdenite) {
                cutely(i, type);
                if (this.f36523cutely) {
                    throw trm.kowloon(this.f36536saneness, i, "A @Path parameter must not come after a @Query.", new Object[0]);
                }
                if (this.f36518apical) {
                    throw trm.kowloon(this.f36536saneness, i, "A @Path parameter must not come after a @QueryName.", new Object[0]);
                }
                if (this.f36526formularize) {
                    throw trm.kowloon(this.f36536saneness, i, "A @Path parameter must not come after a @QueryMap.", new Object[0]);
                }
                if (this.f36529impassible) {
                    throw trm.kowloon(this.f36536saneness, i, "@Path parameters may not be used with @Url.", new Object[0]);
                }
                if (this.f36535polloi == null) {
                    throw trm.kowloon(this.f36536saneness, i, "@Path can only be used with relative url on @%s", this.f36538triweekly);
                }
                this.f36537taiyuan = true;
                observability.molybdenite molybdeniteVar = (observability.molybdenite) annotation;
                String strValue = molybdeniteVar.value();
                taiyuan(i, strValue);
                return new triweekly.apical(this.f36536saneness, i, strValue, this.f36520attabal.taiyuan(type, annotationArr), molybdeniteVar.encoded());
            }
            if (annotation instanceof observability.graveside) {
                cutely(i, type);
                observability.graveside gravesideVar = (observability.graveside) annotation;
                String strValue2 = gravesideVar.value();
                boolean zEncoded = gravesideVar.encoded();
                Class<?> clsImpromptu = trm.impromptu(type);
                this.f36523cutely = true;
                if (!Iterable.class.isAssignableFrom(clsImpromptu)) {
                    if (!clsImpromptu.isArray()) {
                        return new triweekly.formularize(strValue2, this.f36520attabal.taiyuan(type, annotationArr), zEncoded);
                    }
                    return new triweekly.formularize(strValue2, this.f36520attabal.taiyuan(attabal(clsImpromptu.getComponentType()), annotationArr), zEncoded).saneness();
                }
                if (type instanceof ParameterizedType) {
                    return new triweekly.formularize(strValue2, this.f36520attabal.taiyuan(trm.competently(0, (ParameterizedType) type), annotationArr), zEncoded).dern();
                }
                throw trm.kowloon(this.f36536saneness, i, clsImpromptu.getSimpleName() + " must include generic type (e.g., " + clsImpromptu.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof observability.dovishness) {
                cutely(i, type);
                boolean zEncoded2 = ((observability.dovishness) annotation).encoded();
                Class<?> clsImpromptu2 = trm.impromptu(type);
                this.f36518apical = true;
                if (!Iterable.class.isAssignableFrom(clsImpromptu2)) {
                    if (!clsImpromptu2.isArray()) {
                        return new triweekly.C0787triweekly(this.f36520attabal.taiyuan(type, annotationArr), zEncoded2);
                    }
                    return new triweekly.C0787triweekly(this.f36520attabal.taiyuan(attabal(clsImpromptu2.getComponentType()), annotationArr), zEncoded2).saneness();
                }
                if (type instanceof ParameterizedType) {
                    return new triweekly.C0787triweekly(this.f36520attabal.taiyuan(trm.competently(0, (ParameterizedType) type), annotationArr), zEncoded2).dern();
                }
                throw trm.kowloon(this.f36536saneness, i, clsImpromptu2.getSimpleName() + " must include generic type (e.g., " + clsImpromptu2.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof observability.adultoid) {
                cutely(i, type);
                Class<?> clsImpromptu3 = trm.impromptu(type);
                this.f36526formularize = true;
                if (!Map.class.isAssignableFrom(clsImpromptu3)) {
                    throw trm.kowloon(this.f36536saneness, i, "@QueryMap parameter type must be Map.", new Object[0]);
                }
                Type typeTaiyuan = trm.taiyuan(type, clsImpromptu3, Map.class);
                if (!(typeTaiyuan instanceof ParameterizedType)) {
                    throw trm.kowloon(this.f36536saneness, i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType = (ParameterizedType) typeTaiyuan;
                Type typeCompetently = trm.competently(0, parameterizedType);
                if (String.class == typeCompetently) {
                    return new triweekly.impassible(this.f36536saneness, i, this.f36520attabal.taiyuan(trm.competently(1, parameterizedType), annotationArr), ((observability.adultoid) annotation).encoded());
                }
                throw trm.kowloon(this.f36536saneness, i, "@QueryMap keys must be of type String: " + typeCompetently, new Object[0]);
            }
            if (annotation instanceof observability.taiyuan) {
                cutely(i, type);
                String strValue3 = ((observability.taiyuan) annotation).value();
                Class<?> clsImpromptu4 = trm.impromptu(type);
                if (!Iterable.class.isAssignableFrom(clsImpromptu4)) {
                    if (!clsImpromptu4.isArray()) {
                        return new triweekly.beachfront(strValue3, this.f36520attabal.taiyuan(type, annotationArr));
                    }
                    return new triweekly.beachfront(strValue3, this.f36520attabal.taiyuan(attabal(clsImpromptu4.getComponentType()), annotationArr)).saneness();
                }
                if (type instanceof ParameterizedType) {
                    return new triweekly.beachfront(strValue3, this.f36520attabal.taiyuan(trm.competently(0, (ParameterizedType) type), annotationArr)).dern();
                }
                throw trm.kowloon(this.f36536saneness, i, clsImpromptu4.getSimpleName() + " must include generic type (e.g., " + clsImpromptu4.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof observability.cutely) {
                if (type == okhttp3.molybdenite.class) {
                    return new triweekly.impromptu(this.f36536saneness, i);
                }
                cutely(i, type);
                Class<?> clsImpromptu5 = trm.impromptu(type);
                if (!Map.class.isAssignableFrom(clsImpromptu5)) {
                    throw trm.kowloon(this.f36536saneness, i, "@HeaderMap parameter type must be Map.", new Object[0]);
                }
                Type typeTaiyuan2 = trm.taiyuan(type, clsImpromptu5, Map.class);
                if (!(typeTaiyuan2 instanceof ParameterizedType)) {
                    throw trm.kowloon(this.f36536saneness, i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType2 = (ParameterizedType) typeTaiyuan2;
                Type typeCompetently2 = trm.competently(0, parameterizedType2);
                if (String.class == typeCompetently2) {
                    return new triweekly.competently(this.f36536saneness, i, this.f36520attabal.taiyuan(trm.competently(1, parameterizedType2), annotationArr));
                }
                throw trm.kowloon(this.f36536saneness, i, "@HeaderMap keys must be of type String: " + typeCompetently2, new Object[0]);
            }
            if (annotation instanceof observability.dern) {
                cutely(i, type);
                if (!this.f36519arytenoidectomy) {
                    throw trm.kowloon(this.f36536saneness, i, "@Field parameters can only be used with form encoding.", new Object[0]);
                }
                observability.dern dernVar = (observability.dern) annotation;
                String strValue4 = dernVar.value();
                boolean zEncoded3 = dernVar.encoded();
                this.f36521beachfront = true;
                Class<?> clsImpromptu6 = trm.impromptu(type);
                if (!Iterable.class.isAssignableFrom(clsImpromptu6)) {
                    if (!clsImpromptu6.isArray()) {
                        return new triweekly.wireman(strValue4, this.f36520attabal.taiyuan(type, annotationArr), zEncoded3);
                    }
                    return new triweekly.wireman(strValue4, this.f36520attabal.taiyuan(attabal(clsImpromptu6.getComponentType()), annotationArr), zEncoded3).saneness();
                }
                if (type instanceof ParameterizedType) {
                    return new triweekly.wireman(strValue4, this.f36520attabal.taiyuan(trm.competently(0, (ParameterizedType) type), annotationArr), zEncoded3).dern();
                }
                throw trm.kowloon(this.f36536saneness, i, clsImpromptu6.getSimpleName() + " must include generic type (e.g., " + clsImpromptu6.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof observability.wireman) {
                cutely(i, type);
                if (!this.f36519arytenoidectomy) {
                    throw trm.kowloon(this.f36536saneness, i, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
                }
                Class<?> clsImpromptu7 = trm.impromptu(type);
                if (!Map.class.isAssignableFrom(clsImpromptu7)) {
                    throw trm.kowloon(this.f36536saneness, i, "@FieldMap parameter type must be Map.", new Object[0]);
                }
                Type typeTaiyuan3 = trm.taiyuan(type, clsImpromptu7, Map.class);
                if (!(typeTaiyuan3 instanceof ParameterizedType)) {
                    throw trm.kowloon(this.f36536saneness, i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType3 = (ParameterizedType) typeTaiyuan3;
                Type typeCompetently3 = trm.competently(0, parameterizedType3);
                if (String.class == typeCompetently3) {
                    beachfront beachfrontVarTaiyuan = this.f36520attabal.taiyuan(trm.competently(1, parameterizedType3), annotationArr);
                    this.f36521beachfront = true;
                    return new triweekly.marial(this.f36536saneness, i, beachfrontVarTaiyuan, ((observability.wireman) annotation).encoded());
                }
                throw trm.kowloon(this.f36536saneness, i, "@FieldMap keys must be of type String: " + typeCompetently3, new Object[0]);
            }
            if (!(annotation instanceof observability.monoploid)) {
                if (annotation instanceof observability.polloi) {
                    cutely(i, type);
                    if (!this.f36534monoploid) {
                        throw trm.kowloon(this.f36536saneness, i, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
                    }
                    this.f36522competently = true;
                    Class<?> clsImpromptu8 = trm.impromptu(type);
                    if (!Map.class.isAssignableFrom(clsImpromptu8)) {
                        throw trm.kowloon(this.f36536saneness, i, "@PartMap parameter type must be Map.", new Object[0]);
                    }
                    Type typeTaiyuan4 = trm.taiyuan(type, clsImpromptu8, Map.class);
                    if (!(typeTaiyuan4 instanceof ParameterizedType)) {
                        throw trm.kowloon(this.f36536saneness, i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                    }
                    ParameterizedType parameterizedType4 = (ParameterizedType) typeTaiyuan4;
                    Type typeCompetently4 = trm.competently(0, parameterizedType4);
                    if (String.class == typeCompetently4) {
                        Type typeCompetently5 = trm.competently(1, parameterizedType4);
                        if (okhttp3.gintrap.dern.class.isAssignableFrom(trm.impromptu(typeCompetently5))) {
                            throw trm.kowloon(this.f36536saneness, i, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", new Object[0]);
                        }
                        return new triweekly.cutely(this.f36536saneness, i, this.f36520attabal.competently(typeCompetently5, annotationArr, this.f36524dern), ((observability.polloi) annotation).encoding());
                    }
                    throw trm.kowloon(this.f36536saneness, i, "@PartMap keys must be of type String: " + typeCompetently4, new Object[0]);
                }
                if (annotation instanceof observability.attabal) {
                    cutely(i, type);
                    if (this.f36519arytenoidectomy || this.f36534monoploid) {
                        throw trm.kowloon(this.f36536saneness, i, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
                    }
                    if (this.f36530impromptu) {
                        throw trm.kowloon(this.f36536saneness, i, "Multiple @Body method annotations found.", new Object[0]);
                    }
                    try {
                        beachfront beachfrontVarCompetently = this.f36520attabal.competently(type, annotationArr, this.f36524dern);
                        this.f36530impromptu = true;
                        return new triweekly.dern(this.f36536saneness, i, beachfrontVarCompetently);
                    } catch (RuntimeException e) {
                        throw trm.arytenoidectomy(this.f36536saneness, e, i, "Unable to create @Body converter for %s", type);
                    }
                }
                if (!(annotation instanceof observability.rotuma)) {
                    return null;
                }
                cutely(i, type);
                Class<?> clsImpromptu9 = trm.impromptu(type);
                for (int i2 = i - 1; i2 >= 0; i2--) {
                    triweekly<?> triweeklyVar = this.f36525dovishness[i2];
                    if ((triweeklyVar instanceof triweekly.monoploid) && ((triweekly.monoploid) triweeklyVar).f36609attabal.equals(clsImpromptu9)) {
                        throw trm.kowloon(this.f36536saneness, i, "@Tag type " + clsImpromptu9.getName() + " is duplicate of parameter #" + (i2 + 1) + " and would always overwrite its value.", new Object[0]);
                    }
                }
                return new triweekly.monoploid(clsImpromptu9);
            }
            cutely(i, type);
            if (!this.f36534monoploid) {
                throw trm.kowloon(this.f36536saneness, i, "@Part parameters can only be used with multipart encoding.", new Object[0]);
            }
            observability.monoploid monoploidVar = (observability.monoploid) annotation;
            this.f36522competently = true;
            String strValue5 = monoploidVar.value();
            Class<?> clsImpromptu10 = trm.impromptu(type);
            if (strValue5.isEmpty()) {
                if (!Iterable.class.isAssignableFrom(clsImpromptu10)) {
                    if (clsImpromptu10.isArray()) {
                        if (okhttp3.gintrap.dern.class.isAssignableFrom(clsImpromptu10.getComponentType())) {
                            return triweekly.kowloon.f36604attabal.saneness();
                        }
                        throw trm.kowloon(this.f36536saneness, i, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                    }
                    if (okhttp3.gintrap.dern.class.isAssignableFrom(clsImpromptu10)) {
                        return triweekly.kowloon.f36604attabal;
                    }
                    throw trm.kowloon(this.f36536saneness, i, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                }
                if (type instanceof ParameterizedType) {
                    if (okhttp3.gintrap.dern.class.isAssignableFrom(trm.impromptu(trm.competently(0, (ParameterizedType) type)))) {
                        return triweekly.kowloon.f36604attabal.dern();
                    }
                    throw trm.kowloon(this.f36536saneness, i, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                }
                throw trm.kowloon(this.f36536saneness, i, clsImpromptu10.getSimpleName() + " must include generic type (e.g., " + clsImpromptu10.getSimpleName() + "<String>)", new Object[0]);
            }
            okhttp3.molybdenite molybdeniteVarBeachfront = okhttp3.molybdenite.beachfront("Content-Disposition", "form-data; name=\"" + strValue5 + "\"", "Content-Transfer-Encoding", monoploidVar.encoding());
            if (!Iterable.class.isAssignableFrom(clsImpromptu10)) {
                if (!clsImpromptu10.isArray()) {
                    if (okhttp3.gintrap.dern.class.isAssignableFrom(clsImpromptu10)) {
                        throw trm.kowloon(this.f36536saneness, i, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                    }
                    return new triweekly.taiyuan(this.f36536saneness, i, molybdeniteVarBeachfront, this.f36520attabal.competently(type, annotationArr, this.f36524dern));
                }
                Class<?> clsAttabal = attabal(clsImpromptu10.getComponentType());
                if (okhttp3.gintrap.dern.class.isAssignableFrom(clsAttabal)) {
                    throw trm.kowloon(this.f36536saneness, i, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                }
                return new triweekly.taiyuan(this.f36536saneness, i, molybdeniteVarBeachfront, this.f36520attabal.competently(clsAttabal, annotationArr, this.f36524dern)).saneness();
            }
            if (type instanceof ParameterizedType) {
                Type typeCompetently6 = trm.competently(0, (ParameterizedType) type);
                if (okhttp3.gintrap.dern.class.isAssignableFrom(trm.impromptu(typeCompetently6))) {
                    throw trm.kowloon(this.f36536saneness, i, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                }
                return new triweekly.taiyuan(this.f36536saneness, i, molybdeniteVarBeachfront, this.f36520attabal.competently(typeCompetently6, annotationArr, this.f36524dern)).dern();
            }
            throw trm.kowloon(this.f36536saneness, i, clsImpromptu10.getSimpleName() + " must include generic type (e.g., " + clsImpromptu10.getSimpleName() + "<String>)", new Object[0]);
        }

        public final void cutely(int i, Type type) {
            if (trm.cutely(type)) {
                throw trm.kowloon(this.f36536saneness, i, "Parameter type must not include a type variable or wildcard: %s", type);
            }
        }

        public final okhttp3.molybdenite dern(String[] strArr) {
            okhttp3.molybdenite.attabal attabalVar = new okhttp3.molybdenite.attabal();
            for (String str : strArr) {
                int iIndexOf = str.indexOf(58);
                if (iIndexOf == -1 || iIndexOf == 0 || iIndexOf == str.length() - 1) {
                    throw trm.impassible(this.f36536saneness, "@Headers value must be in the form \"Name: Value\". Found: \"%s\"", str);
                }
                String strSubstring = str.substring(0, iIndexOf);
                String strTrim = str.substring(iIndexOf + 1).trim();
                if ("Content-Type".equalsIgnoreCase(strSubstring)) {
                    try {
                        this.f36528graveside = okhttp3.dovishness.marial(strTrim);
                    } catch (IllegalArgumentException e) {
                        throw trm.triweekly(this.f36536saneness, e, "Malformed content type: %s", strTrim);
                    }
                } else {
                    attabalVar.attabal(strSubstring, strTrim);
                }
            }
            return attabalVar.marial();
        }

        public final void marial(Annotation annotation) {
            if (annotation instanceof observability.saneness) {
                wireman("DELETE", ((observability.saneness) annotation).value(), false);
                return;
            }
            if (annotation instanceof observability.beachfront) {
                wireman(C3460cc.a, ((observability.beachfront) annotation).value(), false);
                return;
            }
            if (annotation instanceof observability.competently) {
                wireman("HEAD", ((observability.competently) annotation).value(), false);
                return;
            }
            if (annotation instanceof observability.triweekly) {
                wireman("PATCH", ((observability.triweekly) annotation).value(), true);
                return;
            }
            if (annotation instanceof observability.kowloon) {
                wireman(C3460cc.b, ((observability.kowloon) annotation).value(), true);
                return;
            }
            if (annotation instanceof observability.arytenoidectomy) {
                wireman("PUT", ((observability.arytenoidectomy) annotation).value(), true);
                return;
            }
            if (annotation instanceof observability.impassible) {
                wireman("OPTIONS", ((observability.impassible) annotation).value(), false);
                return;
            }
            if (annotation instanceof observability.impromptu) {
                observability.impromptu impromptuVar = (observability.impromptu) annotation;
                wireman(impromptuVar.method(), impromptuVar.path(), impromptuVar.hasBody());
                return;
            }
            if (annotation instanceof observability.apical) {
                String[] strArrValue = ((observability.apical) annotation).value();
                if (strArrValue.length == 0) {
                    throw trm.impassible(this.f36536saneness, "@Headers annotation is empty.", new Object[0]);
                }
                this.f36533molybdenite = dern(strArrValue);
                return;
            }
            if (annotation instanceof observability.formularize) {
                if (this.f36519arytenoidectomy) {
                    throw trm.impassible(this.f36536saneness, "Only one encoding annotation is allowed.", new Object[0]);
                }
                this.f36534monoploid = true;
            } else if (annotation instanceof observability.marial) {
                if (this.f36534monoploid) {
                    throw trm.impassible(this.f36536saneness, "Only one encoding annotation is allowed.", new Object[0]);
                }
                this.f36519arytenoidectomy = true;
            }
        }

        public gintrap saneness() {
            for (Annotation annotation : this.f36524dern) {
                marial(annotation);
            }
            if (this.f36538triweekly == null) {
                throw trm.impassible(this.f36536saneness, "HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
            }
            if (!this.f36531kowloon) {
                if (this.f36534monoploid) {
                    throw trm.impassible(this.f36536saneness, "Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                }
                if (this.f36519arytenoidectomy) {
                    throw trm.impassible(this.f36536saneness, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                }
            }
            int length = this.f36539wireman.length;
            this.f36525dovishness = new triweekly[length];
            int i = length - 1;
            int i2 = 0;
            while (i2 < length) {
                this.f36525dovishness[i2] = beachfront(i2, this.f36532marial[i2], this.f36539wireman[i2], i2 == i);
                i2++;
            }
            if (this.f36535polloi == null && !this.f36529impassible) {
                throw trm.impassible(this.f36536saneness, "Missing either @%s URL or @Url parameter.", this.f36538triweekly);
            }
            boolean z = this.f36519arytenoidectomy;
            if (!z && !this.f36534monoploid && !this.f36531kowloon && this.f36530impromptu) {
                throw trm.impassible(this.f36536saneness, "Non-body HTTP method cannot contain @Body.", new Object[0]);
            }
            if (z && !this.f36521beachfront) {
                throw trm.impassible(this.f36536saneness, "Form-encoded method must contain at least one @Field.", new Object[0]);
            }
            if (!this.f36534monoploid || this.f36522competently) {
                return new gintrap(this);
            }
            throw trm.impassible(this.f36536saneness, "Multipart method must contain at least one @Part.", new Object[0]);
        }

        public final void taiyuan(int i, String str) {
            if (!f36515preprohormone.matcher(str).matches()) {
                throw trm.kowloon(this.f36536saneness, i, "@Path parameter name must match %s. Found: %s", f36516rotuma.pattern(), str);
            }
            if (!this.f36517adultoid.contains(str)) {
                throw trm.kowloon(this.f36536saneness, i, "URL \"%s\" does not contain \"{%s}\".", this.f36535polloi, str);
            }
        }

        public final void wireman(String str, String str2, boolean z) {
            String str3 = this.f36538triweekly;
            if (str3 != null) {
                throw trm.impassible(this.f36536saneness, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
            }
            this.f36538triweekly = str;
            this.f36531kowloon = z;
            if (str2.isEmpty()) {
                return;
            }
            int iIndexOf = str2.indexOf(63);
            if (iIndexOf != -1 && iIndexOf < str2.length() - 1) {
                String strSubstring = str2.substring(iIndexOf + 1);
                if (f36516rotuma.matcher(strSubstring).find()) {
                    throw trm.impassible(this.f36536saneness, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", strSubstring);
                }
            }
            this.f36535polloi = str2;
            this.f36517adultoid = impromptu(str2);
        }
    }

    public gintrap(attabal attabalVar) {
        this.f36505attabal = attabalVar.f36536saneness;
        this.f36512saneness = attabalVar.f36520attabal.f36556dern;
        this.f36509dern = attabalVar.f36538triweekly;
        this.f36514wireman = attabalVar.f36535polloi;
        this.f36511marial = attabalVar.f36533molybdenite;
        this.f36506beachfront = attabalVar.f36528graveside;
        this.f36507competently = attabalVar.f36531kowloon;
        this.f36510impromptu = attabalVar.f36519arytenoidectomy;
        this.f36513taiyuan = attabalVar.f36534monoploid;
        this.f36508cutely = attabalVar.f36525dovishness;
        this.f36504apical = attabalVar.f36527gintrap;
    }

    public static gintrap saneness(preprohormone preprohormoneVar, Method method) {
        return new attabal(preprohormoneVar, method).saneness();
    }

    public okhttp3.preprohormone attabal(Object[] objArr) throws IOException {
        triweekly<?>[] triweeklyVarArr = this.f36508cutely;
        int length = objArr.length;
        if (length != triweeklyVarArr.length) {
            throw new IllegalArgumentException("Argument count (" + length + ") doesn't match expected count (" + triweeklyVarArr.length + ")");
        }
        dovishness dovishnessVar = new dovishness(this.f36509dern, this.f36512saneness, this.f36514wireman, this.f36511marial, this.f36506beachfront, this.f36507competently, this.f36510impromptu, this.f36513taiyuan);
        if (this.f36504apical) {
            length--;
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            arrayList.add(objArr[i]);
            triweeklyVarArr[i].attabal(dovishnessVar, objArr[i]);
        }
        return dovishnessVar.apical().polloi(apical.class, new apical(this.f36505attabal, arrayList)).saneness();
    }
}
