package com.smartdigimkt.l0;

import com.smartdigimkt.h0.j;
import com.smartdigimkt.h0.l;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class f extends j<String> {
    private static final String o = "f";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Map<String, String> f36316l;
    private com.smartdigimkt.k0.b[] m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f36317n;

    public f(int i2, String str, Map<String, String> map, com.smartdigimkt.k0.b[] bVarArr, com.smartdigimkt.h0.e<String> eVar) {
        super(i2, str, eVar);
        this.f36317n = "---------Ij5ei4KM7KM7ae0KM7cH2ae0Ij5Ef1";
        this.f36316l = map;
        this.m = bVarArr;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.smartdigimkt.h0.j
    public void a(OutputStream outputStream) {
        DataOutputStream dataOutputStream = (DataOutputStream) outputStream;
        try {
            try {
                try {
                    com.smartdigimkt.k0.b[] bVarArr = this.m;
                    if (bVarArr != null) {
                        for (com.smartdigimkt.k0.b bVar : bVarArr) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("--");
                            sb.append(this.f36317n);
                            sb.append(IOUtils.LINE_SEPARATOR_WINDOWS);
                            sb.append("Content-Disposition: form-data;name=\"" + bVar.h() + "\";filename=\"" + bVar.e() + "\"\r\n");
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Content-Type: ");
                            sb2.append(bVar.b());
                            sb2.append("\r\n\r\n");
                            sb.append(sb2.toString());
                            dataOutputStream.write(sb.toString().getBytes());
                            if (bVar.g() != null) {
                                byte[] bArr = new byte[1024];
                                int i2 = 0;
                                while (true) {
                                    int i3 = bVar.g().read(bArr);
                                    if (i3 == -1) {
                                        break;
                                    }
                                    dataOutputStream.write(bArr, 0, i3);
                                    i2 += i3;
                                    com.smartdigimkt.h0.e<T> eVar = this.f35587e;
                                    if (eVar != 0) {
                                        eVar.a(bVar.f(), i2);
                                    }
                                }
                                bVar.g().close();
                            } else {
                                dataOutputStream.write(bVar.c(), 0, bVar.c().length);
                            }
                            dataOutputStream.write(IOUtils.LINE_SEPARATOR_WINDOWS.getBytes());
                        }
                    }
                    dataOutputStream.writeBytes("--" + this.f36317n + "--\r\n");
                    dataOutputStream.flush();
                    dataOutputStream.close();
                } catch (IOException e2) {
                    e2.getMessage();
                    this.f35587e.a(new com.smartdigimkt.i0.a(2, null));
                    dataOutputStream.close();
                }
            } catch (Throwable th) {
                try {
                    dataOutputStream.close();
                } catch (IOException e3) {
                    e3.printStackTrace();
                }
                throw th;
            }
        } catch (IOException e4) {
            e4.printStackTrace();
        }
    }

    @Override // com.smartdigimkt.h0.j
    public byte[] g() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry : this.f36316l.entrySet()) {
            sb.append("--");
            sb.append(this.f36317n);
            sb.append(IOUtils.LINE_SEPARATOR_WINDOWS);
            sb.append("Content-Disposition: form-data; name=\"" + entry.getKey() + "\"\r\n\r\n");
            sb.append(entry.getValue());
            sb.append(IOUtils.LINE_SEPARATOR_WINDOWS);
        }
        return sb.toString().getBytes();
    }

    @Override // com.smartdigimkt.h0.j
    public void q() {
        super.q();
        HashMap map = new HashMap();
        map.put("Content-Type", "multipart/form-data; boundary=" + this.f36317n);
        a((Map<String, String>) map);
    }

    @Override // com.smartdigimkt.h0.j
    public l<String> a(com.smartdigimkt.n0.c cVar) {
        try {
            return l.a(new String(cVar.f36914b, com.smartdigimkt.o0.d.a(cVar.d)), cVar);
        } catch (UnsupportedEncodingException e2) {
            e2.getMessage();
            return l.a(new com.smartdigimkt.i0.a(8, cVar));
        }
    }
}
