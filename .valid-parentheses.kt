/*

 *
 * Given a string containing just the characters '(', ')', '{', '}', '[' and
 * ']', determine if the input string is valid.
 * 
 * An input string is valid if:
 * 
 * 
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * 
 * 
 * Note that an empty string is also considered valid.
 * 
 * Example 1:
 * 
 * 
 * Input: "()"
 * Output: true
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: "()[]{}"
 * Output: true
 * 
 * 
 * Example 3:
 * 
 * 
 * Input: "(]"
 * Output: false
 * 
 * 
 * Example 4:
 * 
 * 
 * Input: "([)]"
 * Output: false
 * 
 * 
 * Example 5:
 * 
 * 
 * Input: "{[]}"
 * Output: true
 * 
 * 
 */

// @lc code=start
class Solution {
    fun isValid(s: String): Boolean {
        var stk = Stack<Char>()
        stk.push('#')
        for (i in s) {
            if (i == '(') stk.push(i)
            if (i == '[') stk.push(i)
            if (i == '{') stk.push(i)
            if (i == ')') {
                val c = stk.pop()
                if (c != '(') return false
            }
            if (i == ']') {
                val c = stk.pop()
                if (c != '[') return false
            }
            if (i == '}') {
                val c = stk.pop()
                if (c != '{') return false
            }
        }
        if (stk.size > 1) return false
        return true
    }
}
// @lc code=end
