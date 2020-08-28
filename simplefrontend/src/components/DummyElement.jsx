import React from 'react'

const DummyElement = ({dummy}) => {
    const {id, name} = dummy
    return (
        <div className="card m-2 text-center">
            <div className="card-body">
                ID: {id} Name: {name}
            </div>
        </div>
    )
}

export default DummyElement
