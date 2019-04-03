package testapplication

import grails.transaction.Transactional

@Transactional
class TestService {

    def static listOp(){
        List l1 =['a','b', 'c'];
        List l2 =['c', 'd', 'e']
        List list3 = l1.clone()
        List l4 = [1,2,3,4,5]

            println l4.max()

    }
    def serviceMethod() {

    }
}
