def buildApp(){
    echo 'buildApp function'
}

def testApp(){
    echo 'testApp function'
}

def deployApp(){
    echo "deployment version ${params.VERSION}"
}

return this