package com.badlogic.gdx.graphics.g3d;

import com.badlogic.gdx.graphics.Camera;
import com.badlogic.gdx.graphics.Mesh;
import com.badlogic.gdx.graphics.VertexAttributes;
import com.badlogic.gdx.graphics.g3d.model.MeshPart;
import com.badlogic.gdx.graphics.g3d.utils.MeshBuilder;
import com.badlogic.gdx.graphics.g3d.utils.RenderableSorter;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.Disposable;
import com.badlogic.gdx.utils.FlushablePool;
import com.badlogic.gdx.utils.GdxRuntimeException;
import com.badlogic.gdx.utils.Pool;
import java.util.Comparator;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class ModelCache implements Disposable, RenderableProvider {
    private boolean building;
    private Camera camera;
    private Array<Renderable> items;
    private MeshBuilder meshBuilder;
    private FlushablePool<MeshPart> meshPartPool;
    private MeshPool meshPool;
    private Array<Renderable> renderables;
    private FlushablePool<Renderable> renderablesPool;
    private RenderableSorter sorter;
    private Array<Renderable> tmp;

    public interface MeshPool extends Disposable {
        void flush();

        Mesh obtain(VertexAttributes vertexAttributes, int i, int i2);
    }

    public static class SimpleMeshPool implements MeshPool {
        private Array<Mesh> freeMeshes = new Array<>();
        private Array<Mesh> usedMeshes = new Array<>();

        @Override // com.badlogic.gdx.utils.Disposable
        public void dispose() {
            Array.ArrayIterator<Mesh> it = this.usedMeshes.iterator();
            while (it.hasNext()) {
                it.next().dispose();
            }
            this.usedMeshes.clear();
            Array.ArrayIterator<Mesh> it2 = this.freeMeshes.iterator();
            while (it2.hasNext()) {
                it2.next().dispose();
            }
            this.freeMeshes.clear();
        }

        @Override // com.badlogic.gdx.graphics.g3d.ModelCache.MeshPool
        public void flush() {
            this.freeMeshes.addAll(this.usedMeshes);
            this.usedMeshes.clear();
        }

        @Override // com.badlogic.gdx.graphics.g3d.ModelCache.MeshPool
        public Mesh obtain(VertexAttributes vertexAttributes, int i, int i2) {
            int i3 = this.freeMeshes.size;
            for (int i4 = 0; i4 < i3; i4++) {
                Mesh mesh = this.freeMeshes.get(i4);
                if (mesh.getVertexAttributes().equals(vertexAttributes) && mesh.getMaxVertices() >= i && mesh.getMaxIndices() >= i2) {
                    this.freeMeshes.removeIndex(i4);
                    this.usedMeshes.add(mesh);
                    return mesh;
                }
            }
            Mesh mesh2 = new Mesh(false, 65536, Math.max(65536, 1 << (32 - Integer.numberOfLeadingZeros(i2 - 1))), vertexAttributes);
            this.usedMeshes.add(mesh2);
            return mesh2;
        }
    }

    public static class Sorter implements RenderableSorter, Comparator<Renderable> {
        @Override // com.badlogic.gdx.graphics.g3d.utils.RenderableSorter
        public void sort(Camera camera, Array<Renderable> array) {
            array.sort(this);
        }

        @Override // java.util.Comparator
        public int compare(Renderable renderable, Renderable renderable2) {
            int iCompareTo = renderable.meshPart.mesh.getVertexAttributes().compareTo(renderable2.meshPart.mesh.getVertexAttributes());
            return (iCompareTo == 0 && (iCompareTo = renderable.material.compareTo((Attributes) renderable2.material)) == 0) ? renderable.meshPart.primitiveType - renderable2.meshPart.primitiveType : iCompareTo;
        }
    }

    public static class TightMeshPool implements MeshPool {
        private Array<Mesh> freeMeshes = new Array<>();
        private Array<Mesh> usedMeshes = new Array<>();

        @Override // com.badlogic.gdx.utils.Disposable
        public void dispose() {
            Array.ArrayIterator<Mesh> it = this.usedMeshes.iterator();
            while (it.hasNext()) {
                it.next().dispose();
            }
            this.usedMeshes.clear();
            Array.ArrayIterator<Mesh> it2 = this.freeMeshes.iterator();
            while (it2.hasNext()) {
                it2.next().dispose();
            }
            this.freeMeshes.clear();
        }

        @Override // com.badlogic.gdx.graphics.g3d.ModelCache.MeshPool
        public void flush() {
            this.freeMeshes.addAll(this.usedMeshes);
            this.usedMeshes.clear();
        }

        @Override // com.badlogic.gdx.graphics.g3d.ModelCache.MeshPool
        public Mesh obtain(VertexAttributes vertexAttributes, int i, int i2) {
            int i3 = this.freeMeshes.size;
            for (int i4 = 0; i4 < i3; i4++) {
                Mesh mesh = this.freeMeshes.get(i4);
                if (mesh.getVertexAttributes().equals(vertexAttributes) && mesh.getMaxVertices() == i && mesh.getMaxIndices() == i2) {
                    this.freeMeshes.removeIndex(i4);
                    this.usedMeshes.add(mesh);
                    return mesh;
                }
            }
            Mesh mesh2 = new Mesh(true, i, i2, vertexAttributes);
            this.usedMeshes.add(mesh2);
            return mesh2;
        }
    }

    public ModelCache() {
        this(new Sorter(), new SimpleMeshPool());
    }

    private Renderable obtainRenderable(Material material, int i) {
        Renderable renderableObtain = this.renderablesPool.obtain();
        renderableObtain.bones = null;
        renderableObtain.environment = null;
        renderableObtain.material = material;
        MeshPart meshPart = renderableObtain.meshPart;
        meshPart.mesh = null;
        meshPart.offset = 0;
        meshPart.size = 0;
        meshPart.primitiveType = i;
        meshPart.center.set(0.0f, 0.0f, 0.0f);
        renderableObtain.meshPart.halfExtents.set(0.0f, 0.0f, 0.0f);
        renderableObtain.meshPart.radius = -1.0f;
        renderableObtain.shader = null;
        renderableObtain.userData = null;
        renderableObtain.worldTransform.idt();
        return renderableObtain;
    }

    public void add(Renderable renderable) {
        if (!this.building) {
            throw new GdxRuntimeException("Can only add items to the ModelCache in between .begin() and .end()");
        }
        if (renderable.bones == null) {
            this.items.add(renderable);
        } else {
            this.renderables.add(renderable);
        }
    }

    public void begin() {
        begin(null);
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
        if (this.building) {
            throw new GdxRuntimeException("Cannot dispose a ModelCache in between .begin() and .end()");
        }
        this.meshPool.dispose();
    }

    public void end() {
        if (!this.building) {
            throw new GdxRuntimeException("Call begin() prior to calling end()");
        }
        this.building = false;
        Array<Renderable> array = this.items;
        if (array.size == 0) {
            return;
        }
        this.sorter.sort(this.camera, array);
        Array<Renderable> array2 = this.items;
        int i = array2.size;
        int i2 = this.renderables.size;
        Renderable renderable = array2.get(0);
        VertexAttributes vertexAttributes = renderable.meshPart.mesh.getVertexAttributes();
        Material material = renderable.material;
        int i3 = renderable.meshPart.primitiveType;
        int i4 = this.renderables.size;
        this.meshBuilder.begin(vertexAttributes);
        MeshPart meshPartPart = this.meshBuilder.part("", i3, this.meshPartPool.obtain());
        this.renderables.add(obtainRenderable(material, i3));
        int i5 = this.items.size;
        for (int i6 = 0; i6 < i5; i6++) {
            Renderable renderable2 = this.items.get(i6);
            VertexAttributes vertexAttributes2 = renderable2.meshPart.mesh.getVertexAttributes();
            Material material2 = renderable2.material;
            int i7 = renderable2.meshPart.primitiveType;
            boolean z = vertexAttributes2.equals(vertexAttributes) && (this.meshBuilder.getNumVertices() + (renderable2.meshPart.mesh.getNumIndices() > 0 ? renderable2.meshPart.mesh.getNumVertices() : renderable2.meshPart.size) <= 65536);
            if (!z || i7 != i3 || !material2.same(material, true)) {
                if (!z) {
                    MeshBuilder meshBuilder = this.meshBuilder;
                    Mesh meshEnd = meshBuilder.end(this.meshPool.obtain(vertexAttributes, meshBuilder.getNumVertices(), this.meshBuilder.getNumIndices()));
                    while (true) {
                        Array<Renderable> array3 = this.renderables;
                        if (i4 >= array3.size) {
                            break;
                        }
                        array3.get(i4).meshPart.mesh = meshEnd;
                        i4++;
                    }
                    this.meshBuilder.begin(vertexAttributes2);
                    vertexAttributes = vertexAttributes2;
                }
                MeshPart meshPartPart2 = this.meshBuilder.part("", i7, this.meshPartPool.obtain());
                Array<Renderable> array4 = this.renderables;
                MeshPart meshPart = array4.get(array4.size - 1).meshPart;
                meshPart.offset = meshPartPart.offset;
                meshPart.size = meshPartPart.size;
                this.renderables.add(obtainRenderable(material2, i7));
                meshPartPart = meshPartPart2;
                material = material2;
                i3 = i7;
            }
            this.meshBuilder.setVertexTransform(renderable2.worldTransform);
            MeshBuilder meshBuilder2 = this.meshBuilder;
            MeshPart meshPart2 = renderable2.meshPart;
            meshBuilder2.addMesh(meshPart2.mesh, meshPart2.offset, meshPart2.size);
        }
        MeshBuilder meshBuilder3 = this.meshBuilder;
        Mesh meshEnd2 = meshBuilder3.end(this.meshPool.obtain(vertexAttributes, meshBuilder3.getNumVertices(), this.meshBuilder.getNumIndices()));
        while (true) {
            Array<Renderable> array5 = this.renderables;
            int i8 = array5.size;
            if (i4 >= i8) {
                MeshPart meshPart3 = array5.get(i8 - 1).meshPart;
                meshPart3.offset = meshPartPart.offset;
                meshPart3.size = meshPartPart.size;
                return;
            }
            array5.get(i4).meshPart.mesh = meshEnd2;
            i4++;
        }
    }

    @Override // com.badlogic.gdx.graphics.g3d.RenderableProvider
    public void getRenderables(Array<Renderable> array, Pool<Renderable> pool) {
        if (this.building) {
            throw new GdxRuntimeException("Cannot render a ModelCache in between .begin() and .end()");
        }
        Array.ArrayIterator<Renderable> it = this.renderables.iterator();
        while (it.hasNext()) {
            Renderable next = it.next();
            next.shader = null;
            next.environment = null;
        }
        array.addAll(this.renderables);
    }

    public ModelCache(RenderableSorter renderableSorter, MeshPool meshPool) {
        this.renderables = new Array<>();
        this.renderablesPool = new FlushablePool<Renderable>() { // from class: com.badlogic.gdx.graphics.g3d.ModelCache.1
            @Override // com.badlogic.gdx.utils.Pool
            public Renderable newObject() {
                return new Renderable();
            }
        };
        this.meshPartPool = new FlushablePool<MeshPart>() { // from class: com.badlogic.gdx.graphics.g3d.ModelCache.2
            @Override // com.badlogic.gdx.utils.Pool
            public MeshPart newObject() {
                return new MeshPart();
            }
        };
        this.items = new Array<>();
        this.tmp = new Array<>();
        this.sorter = renderableSorter;
        this.meshPool = meshPool;
        this.meshBuilder = new MeshBuilder();
    }

    public void begin(Camera camera) {
        if (this.building) {
            throw new GdxRuntimeException("Call end() after calling begin()");
        }
        this.building = true;
        this.camera = camera;
        this.renderablesPool.flush();
        this.renderables.clear();
        this.items.clear();
        this.meshPartPool.flush();
        this.meshPool.flush();
    }

    public void add(RenderableProvider renderableProvider) {
        renderableProvider.getRenderables(this.tmp, this.renderablesPool);
        int i = this.tmp.size;
        for (int i2 = 0; i2 < i; i2++) {
            add(this.tmp.get(i2));
        }
        this.tmp.clear();
    }

    public <T extends RenderableProvider> void add(Iterable<T> iterable) {
        Iterator<T> it = iterable.iterator();
        while (it.hasNext()) {
            add(it.next());
        }
    }
}
