package JavaSE.JavaSE14;

public class RealLinkedList {
    public ListNode head;
    public ListNode tail;   //指向链表的最后一个结点，有了tail以后，尾插法的时间复杂度变成O（1）

    //头插法
    public void addFirst(int data){
        ListNode node = new ListNode(data);
        if (this.head == null){
            this.head = node;
            this.tail = node;    //头插法的话，tail始终是最开始那个head，所以只需要赋值一次
        }else{
            node.next = this.head;
            this.head.prev = node;
            this.head = node;
        }
    }
    //尾插法
    public void addLast(int data){
        ListNode node = new ListNode(data);
        if (this.head == null){
            this.head = node;
            this.tail = node;
        }else{
            this.tail.next = node;
            node.prev = this.tail;
            this.tail = node;
        }
    }
    public ListNode searchIndex(int index){
        ListNode cur = this.head;
        int i = 0;
        while (i < index){
            cur = cur.next;
            i++;
        }
        return cur;
    }
    //任意位置插入,第一个数据节点为0号下标
    public boolean addIndex(int index,int data){
        if (index < 0 || index > this.size()){
            return false;
        }
        if (index == 0){
            this.addFirst(data);
            return true;
        }
        if (index == this.size()){
            this.addLast(data);
            return true;
        }

        ListNode node = new ListNode(data);
        ListNode cur = searchIndex(index);

        node.prev = cur.prev;
        node.next = cur;
        cur.prev.next = node;
        cur.prev = node;
        return true;
    }
    //查找是否包含关键字key是否在单链表当中
    public boolean contains(int key){
        if (this.head == null){
            System.out.println("链表为空");
            return false;
        }
        ListNode p = this.head;
        while(p != null){
            if(p.data == key){
                return true;
            }
            p = p.next;
        }
        return false;
    }
    //删除第一次出现关键字为key的节点
    public void remove(int key){
        if (this.head == null){
            System.out.println("链表为空");
            return ;
        }
        if (this.head.data == key){    //如果要删除的是第一个结点，进行一波特判
            this.head = head.next;
            this.head.prev = null;
            //注意这里要把prev置空，在单向链表中不需要置空
 // 是因为单链表head=head.next后，已经没有引用是第一个结点的了，堆中的空间会被自动回收，而这里的还有prev引用着第一个结点，固需要置空
            return;
        }
        ListNode cur = this.head;
        while (cur != null){
            if (cur.data == key){
                cur.prev.next = cur.next;
                if (cur.next == null){
                    this.tail = cur.prev;    //如果删除的是最后一个结点，不要忘记对tail的值进行修改
                    return;
                }
                cur.next.prev = cur.prev;    //如果cur为最后一个结点，这里会出现空指针异常
                break;
            }
            cur = cur.next;
        }
    }

    //删除所有值为key的节点
    public void removeAllKey(int key){
        if (this.head == null){
            System.out.println("链表为空");
            return ;
        }
        ListNode cur = head.next;
        while (cur != null){
            if (cur.data == key){
                cur.prev.next = cur.next;
                if (cur.next == null){
                    this.tail = cur.prev;    //如果删除的是最后一个结点，不要忘记对tail的值进行修改
                    break;
                }
                cur.next.prev = cur.prev;    //如果cur为最后一个结点，这里会出现空指针异常
            }
            cur = cur.next;
        }

        if (this.head.data == key){
            this.head = this.head.next;
            this.head.prev = null;
        }
    }

    //得到单链表的长度
    public int size(){
        ListNode p = this.head;
        int len = 0;
        while (p != null){
            p = p.next;
            len++;
        }
        return len;
    }
    public void display(){
        ListNode cur = head;
        while (cur != null){
            System.out.println(cur.data);
            cur = cur.next;
        }
    }

    public void clear(){    //注意双向链表必须将所有结点的prev和next都置空,这样才能确保每个结点都没有被引用
        ListNode cur = head;
        ListNode curNext;
        while (cur != null){
            curNext = cur.next;
            cur.prev = null;
            cur.next = null;
            cur = curNext;
        }
        this.head = null;
        this.tail = null;
        //注意别忘了把head和tail置空
    }
}
