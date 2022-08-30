package JavaSE.JavaSE11;

public class MyLinkedList {  //不带头结点

    public Node head ;  //这个不算头结点，算是这个链表的第一个节点

    //头插法
    public void addFirst(int data){
        Node node = new Node(data);    //先创建一个node，把数据放进这个node，再把这个node头插

        if(this.head == null){    //注意这里要进行特判
            this.head = node;
        }else {
            node.next = this.head;
            this.head = node;
        }
    }

    //尾插法
    public void addLast(int data){
        Node node =new Node(data);
        if(this.head == null){
            this.head = node;
        }else {
            Node cur = this.head;
            while (cur.next != null){
                cur = cur.next;
            }
            cur.next = node;
        }
    }


    public Node searchPrev(int index){     //返回index所对应结点的前一个结点
        Node p = this.head;
        int count = 0;
        while(count < index-1){
            p = p.next;
            count++;
        }
        return p;
    }

    //任意位置插入,第一个数据节点为0号下标
    public boolean addIndex(int index,int data){
        int len = this.size();
        if (index > len ||index < 0){   //对index合法性特判
            return false;
        }
        if(index == 0){   //当在头部插入时，使用头插法
            this.addFirst(data);
            return true;
        }
        if (index == len){  //当在尾部插入时，使用尾插法
            this.addLast(data);
            return true;
        }else {
            Node p = this.searchPrev(index); //找到index所对应结点的前一个结点
            Node node = new Node(data);
            node.next = p.next;
            p.next = node;
            return true;
        }
    }


    //查找是否包含关键字key是否在单链表当中
    public boolean contains(int key){
        Node p = this.head;
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
            return;
        }
        if(this.head.data == key){
            this.head = this.head.next;
            return;
        }
        Node pre = head;
        Node cur = head.next;
        while(cur != null){
            if(cur.data == key){
                pre.next = cur.next;
                break;
            }else {
                pre = cur;
            }
            cur = cur.next;
        }
    }
    //删除所有值为key的节点
    public void removeAllKey(int key){
        if (this.head == null){
            System.out.println("链表为空");
        }
        Node pre = head;
        Node cur = head.next;
        while(cur != null){
            if(cur.data == key){
                pre.next = cur.next;
            }else {
                pre = cur;
            }
            cur = cur.next;
        }

       if(this.head.data == key){   //如果本来的第二个结点还是key呢，这个必须放到后面去
            this.head = this.head.next;
        }
    }

    //得到单链表的长度
    public int size(){
        Node p = this.head;
        int len = 0;
        while (p != null){
            p = p.next;
            len++;
        }
        return len;
    }
    public void display(){
        Node cur = head;
        while (cur != null){
            System.out.println(cur.data);
            cur = cur.next;
        }
    }
  public void clear(){
        this.head = null;
  }
}
