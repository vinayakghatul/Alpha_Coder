package ArrayList;//{ Driver Code Starts

class TwoStackOneArray
{

    int n = 10;
    int top1 = n/2;
    int top2 = n/2 + 1;
    int[] nums = new int[n];



    public static void main(String args[])
    {
        TwoStackOneArray sq = new TwoStackOneArray();
        sq.push1(1);
        sq.push2(2);
        sq.push1(3);
        sq.push2(4);

        System.out.println(sq.pop1());
        System.out.println(sq.pop2());
    }

    //Function to push an integer into the stack1.
    void push1(int x)
    {
        if (top1 > 0) {
            nums[top1] = x;
            top1--;
        }
    }

    //Function to push an integer into the stack2.
    void push2(int x)
    {
        if (top2 < n-1) {
            nums[top2] = x;
            top2++;
        }
    }

    //Function to remove an element from top of the stack1.
    int pop1()
    {
        return nums[++top1];
    }

    //Function to remove an element from top of the stack2.
    int pop2()
    {
        return nums[--top2];
    }
}


